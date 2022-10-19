public class Mage {

    String name;
    int level;
    int damage;
    String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        return "{" + name + ", " + level + ", " + damage + ", " + type + "}";
    }

    public String fight(Mage mage) {
        if ((this.type).equals(mage.type)) {
            if (this.level < mage.level) {
                return mage.name;
            } else if (this.level > mage.level) {
                return this.name;
            } else {
                if (this.damage < mage.damage) {
                    return mage.name;
                } else if (this.damage > mage.damage) {
                    return this.name;
                } else {
                    return "draw";
                }
            }
        }
        else {
            switch (this.type) {
                case "fire":
                    if ((mage.type).equals("ice")) {
                        return this.name;
                    } else if ((mage.type).equals("earth")) {
                        return mage.name;
                    }
                    break;
                case "ice":
                    if ((mage.type).equals("earth")) {
                        return this.name;
                    } else if ((mage.type).equals("fire")) {
                        return mage.name;
                    }
                    break;
                case "earth":
                    if ((mage.type).equals("fire")) {
                        return this.name;
                    } else if ((mage.type).equals("ice")) {
                        return mage.name;
                    }
                    break;
            }
        }
        return null;
    }
}
