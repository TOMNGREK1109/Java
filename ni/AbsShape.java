package ni;

/**
  図形抽象クラスの定義
*/
abstract class AbsShape {
  // フィールド定義
  // 図形の種類
  private int shapeType;
  private String[] shapeTypeStr = {"三角形","四角形","円"};

  // この図形の種類の文字列を返却するメソッド
  String getShapeTypeStr(){
    return shapeTypeStr[shapeType];
  };
  // shapeTypeのセッター
  void setShapeType(int num){
    shapeType = num;
  }
  // shapeTypeのゲッター
  int getShapeType(){
    return shapeType;
  };

  // 抽象メソッド定義
  // 面積を計算して返却する抽象メソッド
  abstract double calcArea();
  // 図形のデータを表示する抽象メソッド
  abstract void displayData();
}
