package com.dl.study.controller;

import com.dl.study.util.ImagesDownloadUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.zip.ZipOutputStream;

@Controller
public class DownloadController {

    @RequestMapping(value = "/downLoadZipFile")
    public void downLoadZipFile(@RequestParam("imgs") String imgs, @RequestParam("memberName") String memberName,
                                HttpServletResponse response) throws Exception {
        String[] img = imgs.split(",");
        // 定义根路径
      //  String rootPath = PlatformConstants.IMG_DISK_PATH;
        String rootPath = "D:/decode/";


        String zipName = memberName + ".zip";
        response.setContentType("APPLICATION/OCTET-STREAM");
        response.setHeader("Content-Disposition", "attachment; filename=" + zipName);
        ZipOutputStream out = new ZipOutputStream(response.getOutputStream());
        try {
            for (int i = 0; i < img.length; i++) {


                ImagesDownloadUtil.zipFile(rootPath + "/" + img[i], out);
                response.flushBuffer();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            out.flush();
            out.close();
        }
    }
}
