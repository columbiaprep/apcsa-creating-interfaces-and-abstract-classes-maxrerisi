public abstract class Equipment extends Item{
    private String typeOfEquipment;


    public Equipment(String typeOfEquipment) {
        super();
        this.typeOfEquipment = typeOfEquipment;
    }

    public void equip() {}
    public void unequip() {}

}