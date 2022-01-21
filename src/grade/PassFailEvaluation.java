package grade;

public class PassFailEvaluation implements Grade
{

    @Override
    public String getGrade(int point)
    {
        if (point >= 60)
        {
            return "P";
        }
        else
        {
            return "F";
        }
    }

}
