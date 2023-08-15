public class LogicalOperators {
    public static void main(String[] args) {
        /*
        && --> and ( if all of the conditions are true, then it'll return true.)
        || --> or  ( if one of the conditions are true, then it'll return true.)
        !  --> not ( true -> false , false -> true)
         */

        System.out.println(3 == 3 && 2 != 3); // Both condition is true, then true.
        System.out.println(1 != 1 || 3 > 1); // One condition is ture, then true.
        System.out.println(!(1 != 1));
    }
}
