public class Ouroboros {
    public static void main(String[] args) {
        String s = "s = 'public class Ouroboros {0:c}{1:c}    public static void main(String[] args) {0:c}{1:c}        String s = {5:c}s = {2:c}{3}{2:c}{6:s}c = {2:c}%2$s{2:c}{6:s}print(s.format(123, 10, 39, s, 125, 34, c, 92)){5:c};        {1:c}        System.out.printf(s, 10, {5:c}{6:s}{5:c});{1:c}    {4:c}{1:c}{4:c}'%1$cc = '%2$s'%1$cprint(s.format(123, 10, 39, s, 125, 34, c, 92))";        
        System.out.printf(s, 10, "%1$c");
    }
}