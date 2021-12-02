/**
 * Avatar is Compositional class
 * Pet is Association class
 * VirtualHouse is Aggregation class
 * Weapon is Dependency class
 * @author Okky Roy Dirgantara
 */

public class Player {
    public Avatar avatar;
    public Pet pet;
    public VirtualHouse virtualHouse;

    public Player() {
    }

    public Player(Avatar avatar, Pet pet, VirtualHouse virtualHouse) {
        this.avatar = avatar;
        this.pet = pet;
        this.virtualHouse = virtualHouse;
    }

    public void createHouse() {
        virtualHouse.createHouse(this.virtualHouse);
    }

    public void buyPet(Pet pet) {
        avatar.buyPet(pet);
        avatar.VirtualHouse.addPet(pet);
    }
    public void attack(Weapon weapon) {
        avatar.attack(weapon);
    }
}
