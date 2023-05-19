/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风) {@code @Date:2023/5/16 18:59}
 * @File: Translator.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
import java.net.*;
import java.io.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class Translator {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入要翻译的内容：");
        String input = in.readLine();

        // 中译英
        String url = "http://fanyi.youdao.com/translate?doctype=json&type=ZH_CN2EN&i=" + URLEncoder.encode(input, "UTF-8");
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
        String line;
        StringBuffer response = new StringBuffer();
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        String result = parseJson(response.toString());
        System.out.println("中译英结果：" + result);

        // 英译中
        url = "http://fanyi.youdao.com/translate?doctype=json&type=EN2ZH_CN&i=" + URLEncoder.encode(input, "UTF-8");
        obj = new URL(url);
        con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");

        reader = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
        response = new StringBuffer();
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        result = parseJson(response.toString());
        System.out.println("英译中结果：" + result);
    }

    private static String parseJson(String json) {
        String result = "";
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray jsonArray = jsonObject.getJSONArray("translateResult");
            JSONArray dstArray = jsonArray.getJSONArray(0);
            result = dstArray.getJSONObject(0).getString("tgt");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }
}

