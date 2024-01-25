/**
 * 人クラス
 * 
*/
abstract class Person {
    // 名前
    public String name = "";
    // 職業
    public String job = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     */
    Person(String name, String job){
        this.name = name;
        this.job = job;
    }

    /**
     * 自己紹介
     * 
     */
    public void introduce(){
        System.out.println("氏名:" + this.name);
    }
}
     
        

/**
 * 教師クラス
 * 
 */
class Teacher extends Person {

    // 担当科目
    public String subject = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param subject 担当科目
     */
    public Teacher(String name, String job, String subject) {
        // 親クラスのコンストラクタを呼び出し
        super(name, job);
        this.subject = subject;
    }

    /**
     * 自己紹介
     * 
     */
    @Override public void introduce() {
        System.out.println("氏名:" + name);
        System.out.println("職種:" + job);
        System.out.println("担当科目:" + subject);
    }
}
     
/**
 * 料理人クラス
 * 
 */
class Cook extends Person {

    // 得意料理
    public String specialities = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param specialities 得意料理
     */
    public Cook(String name, String job, String specialities) {
        // 親クラスのコンストラクタを呼び出し
        super(name,job);
        this.specialities = specialities;
    }

    /**
     * 自己紹介
     * 
     */
    @Override public void introduce(){
        System.out.println("氏名:" + name);
        System.out.println("職種:" + job);
       System.out.println("得意料理:" + specialities);
    }
}

/**
 * メイン処理クラス
 */
public class M12_2 { 
    public static void main(String[] args) {
        // 教師クラス作成
        Teacher teacher = new Teacher("近藤勇", "教員", "Go言語");
        // 料理人クラス作成
        Cook cook = new Cook("沖田総司", "シェフ", "オムライス");
        
        // 自身の情報を表示
        teacher.introduce();
        System.out.println("");
        cook.introduce();
    }
}

