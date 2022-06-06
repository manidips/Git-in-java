public class uniqueValue {
  static int count(int[] arr) {
    int cou = 1;
    for (int i = 1; i < arr.length; i++) {
      int j;
      for (j = 0; j < i; j++) {
        if (arr[j] == arr[i]) {
          break;
        }
      }
      if (i == j)
        cou++;
    }
    return cou;
  }

  public static void main(String[] args) {
    int[] arr = { 15, 15, 24, 95, 36, 18, 75, 36, 8 };
    System.out.println(count(arr));
  }
}
