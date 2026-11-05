//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Train spanan = new Train("Спб", "75","18:20:32");
    spanan.isDelayed(60);
    System.out.print(spanan.toString());
}
