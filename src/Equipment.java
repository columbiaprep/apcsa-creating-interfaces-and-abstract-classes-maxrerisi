public abstract class Equipment extends Item implements StatModifiers{
    private String typeOfEquipment;


    public Equipment(String typeOfEquipment) {
        super();
        this.typeOfEquipment = typeOfEquipment;
    }

    public void equip() {}
    public void unequip() {}

}