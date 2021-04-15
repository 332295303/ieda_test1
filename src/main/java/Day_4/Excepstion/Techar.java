package Day_4.Excepstion;

public class Techar {
    private  int score;
    public Techar(int score) throws CustomException{
        this.score = score;
        if (score>100||score<0){
            throw new CustomException("输入的分数不正确 程序种植");
        }
        else {
            System.out.println(" 输出正常");
        }
    }



}
