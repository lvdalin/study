package com.dl.study.m3;

import java.util.zip.ZipOutputStream;

/**
 * Description: <br/>
 * Date: 2017年1月10日 上午10:40:36 <br/>
 * 

 * @version
 * @see
 */


/*@Controller
@RequestMapping("/admin/download")*/
public class DownloadImagesController {


    /**
     * 
     * Description: 下载压缩包<br/>

     * @param
     * @param
     * @param
     * @throws Exception
     */
  //  @RequestMapping(value = "/downLoadZipFile")
    /*public void downLoadZipFile(@RequestParam("imgs") String imgs, @RequestParam("memberName") String memberName,
            HttpServletResponse response) throws Exception {
        String[] img = imgs.split(",");
        // 定义根路径
        String rootPath = PlatformConstants.IMG_DISK_PATH;


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
    }*/
    public static void main(String[] args) {
        //String[] img = imgs.split(",");
        // 定义根路径
     /* //  String rootPath = PlatformConstants.IMG_DISK_PATH;


        String zipName = "3333" + ".zip";
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
        }*/
    }

}