package com.snail.test;

import com.google.gson.Gson;

import java.io.*;
import java.util.List;

public class NewLayoutToXml {

    public static void main(String[] args) {
        try {
            Layout layout = new Gson().fromJson(new FileReader(new File("./manifest.json")), Layout.class);
            List<Layout.LayoutsBean> layouts = layout.getLayouts();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./oldManifest.xml", false)));
            bufferedWriter.write("<?xml version=\"1.0\" encoding=\"GBK\"?>");
            bufferedWriter.newLine();
            bufferedWriter.write("<TemplatePackage author=\"libf\" desc=\"移动IPTV功能模板包V1.0\" label=\"\">");
            bufferedWriter.newLine();
            for (int i = 0; i < layouts.size(); i++) {
                Layout.LayoutsBean layoutsBean = layouts.get(i);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<template ")
                        .append("name=\"").append(layoutsBean.getName()).append("\"")
                        .append(" type=\"").append(layoutsBean.getPageType()).append("\"")
                        .append(" desc=\"").append(layoutsBean.getTitle()).append("\"")
                        .append(" template_path=\"").append(layoutsBean.getName()).append("\"")
                        .append(" preview_path=\"").append(layoutsBean.getPreview()).append("\"")
                        .append(">")
                        .append("\n");
                List<Layout.LayoutsBean.Params> params = layoutsBean.getParams();
                for (Layout.LayoutsBean.Params param : params) {
                    stringBuilder.append("<param ")
                            .append(" name=\"").append(param.getName()).append("\"")
                            .append(" type=\"").append(param.getType()).append("\"")
                            .append(" value=\"").append(param.getValue()).append("\"")
                            .append(" desc=\"").append(param.getTitle()).append("\"")
                            .append("/>")
                            .append("\n");
                }
                stringBuilder.append("</template>");
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.write("\n");
            }
            bufferedWriter.write("</TemplatePackage>");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
