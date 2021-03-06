package com.dl.study.m3;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
* @Title: ImageUtil
* @Description: 
* @Company: 卜凡起的博客
* @author    FANQIBU
* @date       2018年2月1日
*/
public class ImageUtil {

        /**

         * 对图片进行放大

         * @param originalImage 原始图片

         * @param times 放大倍数

         * @return

         */

        public static BufferedImage  zoomInImage(BufferedImage  originalImage, Integer times){

            int width = originalImage.getWidth()*times;

            int height = originalImage.getHeight()*times;

            BufferedImage newImage = new BufferedImage(width,height,originalImage.getType());

            Graphics g = newImage.getGraphics();

            g.drawImage(originalImage, 0,0,width,height,null);

            g.dispose();

            return newImage;

        }

        /**

         * 对图片进行放大

         * @param srcPath 原始图片路径(绝对路径)

         * @param newPath 放大后图片路径（绝对路径）

         * @param times 放大倍数

         * @return 是否放大成功

         */

        public static boolean zoomInImage(String srcPath,String newPath,Integer times){

            BufferedImage bufferedImage = null;

            try {

                File of = new File(srcPath);

                if(of.canRead()){

                    bufferedImage =  ImageIO.read(of);

                }

            } catch (IOException e) {

                //TODO: 打印日志

                return false;

            }

            if(bufferedImage != null){

                bufferedImage = zoomInImage(bufferedImage,times);

                try {

                    //TODO: 这个保存路径需要配置下子好一点

                    ImageIO.write(bufferedImage, "JPG", new File(newPath)); //保存修改后的图像,全部保存为JPG格式

                } catch (IOException e) {

                    // TODO 打印错误信息

                    return false;

                }

            }

            return true;

        }

        /**

         * 对图片进行缩小

         * @param originalImage 原始图片

         * @param times 缩小倍数
         * 
         * @param reducewidth 缩放后减小宽度 (当times=-1时此参数及是图片宽度)
         * @param reduceheight 缩放后减小高度(同上)

         * @return 缩小后的Image

         */

        public static BufferedImage  zoomOutImage(BufferedImage  originalImage, Integer times,int reducewidth,int reduceheight){

            int width = originalImage.getWidth()/times-reducewidth;
            if(width < 0){
                width=originalImage.getWidth();
            }
            int height = originalImage.getHeight()/times-reduceheight;
            if(height < 0){
                height=originalImage.getHeight();
            }
            if(times == -1){
                width= reducewidth;
                height =reduceheight;
            }
            BufferedImage newImage = new BufferedImage(width,height,originalImage.getType());

            Graphics g = newImage.getGraphics();

            g.drawImage(originalImage, 0,0,width,height,null);

            g.dispose();

            return newImage;

        }

        /**

         * 对图片进行缩小

         * @param srcPath 源图片路径（绝对路径）

         * @param newPath 新图片路径（绝对路径）

         * @param times 缩小倍数

         * @return 保存是否成功

         */

        public static boolean zoomOutImage(String srcPath,String newPath,Integer times){

            BufferedImage bufferedImage = null;

            try {

                File of = new File(srcPath);

                if(of.canRead()){

                    bufferedImage =  ImageIO.read(of);

                }

            } catch (IOException e) {

                //TODO: 打印日志

                return false;

            }

            if(bufferedImage != null){

                bufferedImage = zoomOutImage(bufferedImage,times,0,0);

                try {

                    //TODO: 这个保存路径需要配置下子好一点

                    ImageIO.write(bufferedImage, "JPG", new File(newPath)); //保存修改后的图像,全部保存为JPG格式

                } catch (IOException e) {

                    // TODO 打印错误信息

                    return false;

                }

            }

            return true;

        }
}