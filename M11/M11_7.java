package M11;

class Student {
  private String name;
  private String studentNumebeer;
  private int[] testScores;

  public Student(String name, String studentNumber, int[] testScores){
    this.name = name;
    this.studentNumebeer = studentNumber;
    this.testScores = testScores; 
  }

  //三科目の平均点を計算するメソッド
  public double calculateAverage() {
    int sum = 0;
    for (int score : testScores) {
      sum += score;
    }
    return (double) sum / testScores.length;
  }

  //3科目の合計点を計算するメソッド
  public int calculateTotal() {
    int total = 0;
    for (int score : testScores) {
      total += score;
    }
    return total;
  }

  //学生情報を表示するメソッド
  public void displayStudentInfo() {
    System.out.printf(" %s 番 %s 平均点%.2f%n",studentNumebeer, name,calculateAverage());
  }
}

//public class M11_7 {
//
//}