package com.design.mode.simplefactory;

public class SimpleFactory {
   /*
     V1版本
    public Video getVideo(String type){
        if ("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if ("Python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }*/

   public Video getVideo(Class<? extends Video> clz){
      Video video = null;
      try {
         video = clz.newInstance();
      } catch (InstantiationException e) {
         e.printStackTrace();
      } catch (IllegalAccessException e) {
         e.printStackTrace();
      }
      return video;
   }
}
