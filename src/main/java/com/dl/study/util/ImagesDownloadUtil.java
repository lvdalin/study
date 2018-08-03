package com.dl.study.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ImagesDownloadUtil {


    /**
     * 
     * Description: 压缩工具类<br/>
     *
     * @author vnilk
     * @param fileName
     * @param out
     * @throws Exception
     */
    public static void zipFile(String fileName, ZipOutputStream out) throws Exception {
        File file = new File(fileName);
        if (file.exists()) {
            byte[] buffer = new byte[1024];
            FileInputStream fis = new FileInputStream(file);
            out.putNextEntry(new ZipEntry(file.getName()));
            int len = 0;
            // 读入需要下载的文件的内容，打包到zip文件
            while ((len = fis.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
            out.flush();
            out.closeEntry();
            fis.close();
        }
    }
}