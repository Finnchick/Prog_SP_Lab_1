package siarhei.klybik.firstapp;

public class Tribe {
        private String Name;
        private int quantity;
        private boolean IsIntroducedToFire;
        public Tribe () {
        Name = "Reaapperi";
        quantity = 20;
        IsIntroducedToFire = false;
        }

        public void ShowName() {
            System.out.println(this.Name);
        }
    public void ShowFireTrigger() {
        System.out.println(this.IsIntroducedToFire);
    }
    public void ShowQuantity() {
        System.out.println(this.quantity);
    }
}
