package ni;

import mondai13.Shape;

/**
  三角形クラスの定義
*/
public class Triangle extends {
  // フィールド定義
  private double bottom; //底辺
  private double height; //高さ
  // コンストラクタ定義
  public Triangle(double bottom,double height) {
    // 抽象クラスから継承されたshapeTypeに三角形を意味する0を代入する
    this.setShapeType(0);
    // 底辺を代入
    this.bottom = bottom;
    // 高さを代入
    this.height = height;
  }

  //ゲッターとセッターを定義
  public double getBottom() {
    return bottom;
  }
  public double getHeight() {
    return height;
  }
  public void setBottom(double bottom) {
    this.bottom = bottom;
  }
  public void setHeight(double height) {
    this.height = height;
  }

  // 抽象メソッドのオーバーライド
  // 面積を計算して返却する
  public double calcArea(){
    //三角形の面積の求め方は、底辺×高さ÷2
  }
}