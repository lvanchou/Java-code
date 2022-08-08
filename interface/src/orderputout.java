class orderputout {
    public void order(person[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.println(arr[x] + "]");
            }
            System.out.print(arr[x] + ",");
        }
    }
}
