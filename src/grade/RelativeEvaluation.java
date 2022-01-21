//package grade;
//
//
//import school.Score;
//import school.Student;
//
//
//import java.util.ArrayList;
//
//import java.util.Collections;
//
//public class RelativeEvaluation implements Grade
//{
//
//    @Override
//    public String getGrade(int point)
//    {
//
//        ArrayList<Student> studentList = new ArrayList<Student>();
//        ArrayList<Score> scoreList = new ArrayList<Score>();
//        Collections.sort(scoreList, Collections.reverseOrder());
//
//        int total = scoreList.size(); //Ex)20명
//        int gradeACut = total / 100 * 10; // 2명
//        int gradeBCut = total / 100 * 20; // 4명
//        int gradeCCut = total / 100 * 30; // 6명
//        int gradeDCut = total / 100 * 30; // 6명 나머지 F
//        String level = "F";
//
//        loop:
//        for (int i = 0; i <= gradeACut - 1; i++)
//        {
//            if (scoreList.get(i).getPoint() == point)
//            {
//                return level="A";
//                break loop;
//            }
//
//
//            for (int j = gradeACut; j <= gradeACut + gradeBCut - 1; j++)
//            {
//                if (scoreList.get(j).getPoint() == point)
//                {
//                    return level="B";
//                    break loop;
//                }
//
//                for (int k = gradeACut + gradeBCut; k <= gradeACut + gradeBCut + gradeCCut - 1; k++)
//                {
//                    if (scoreList.get(k).getPoint() == point)
//                    {
//                        return level="C";
//                        break loop;
//                    }
//
//                    for (int l = gradeACut + gradeBCut + gradeCCut; l <= gradeACut + gradeBCut + gradeCCut + gradeDCut - 1; l++)
//                    {
//                        if (scoreList.get(l).getPoint() == point)
//                        {
//                            return level="D";
//                            break loop;
//                        }
//
//                        for(int m = gradeACut + gradeBCut + gradeCCut + gradeDCut; m <= total-1; m++)
//                        {
//                            if(scoreList.get(m).getPoint() == point)
//                            {
//                                return level="F";
//                                break loop;
//                            }
//                        }
//                    }
//                }
//            }
//
//        }
//    }
//}
