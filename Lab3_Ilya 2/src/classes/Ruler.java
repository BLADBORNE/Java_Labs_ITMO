package classes;

import exceptions.DoesNotBelong;
import exceptions.RulerBreakException;

public class Ruler extends Subject {

    private String type;

    public Ruler(String name, String type) {
        super(name);
        this.type = type;
    }

    public Ruler(String name) {
        super(name);
    }

    public String getType() {
        return type;
    }

    @Override
    public void bend(Object obj) throws DoesNotBelong {
        if (obj instanceof Subject subject) {
            System.out.println("the ruler was bend");
        } else {
            System.out.println("the ruler was not band");
            throw new DoesNotBelong("The object does not belong to the Subject class");
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class End {
        private int endSpaceAmount;
        private int length;

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public End(int length, int endSpaceAmount) throws RulerBreakException {
            this.endSpaceAmount = endSpaceAmount;
            this.length = length;
            if (length < 21 || length != endSpaceAmount) {
                throw new RulerBreakException("you can't type negative ruler length");
            }

        }

        public void plugIn(String leftEnd, String rightEnd) {
            System.out.println("He plugged in " + leftEnd + " to the one end" +
                    " and " + rightEnd + " to another.");
        }

        public int getEndSpaceAmount() {
            return endSpaceAmount;
        }


        public void setEndSpaceAmount(int endSpaceAmount) throws RulerBreakException {
            this.endSpaceAmount = endSpaceAmount;
            if (endSpaceAmount < 0) {
                throw new RulerBreakException("the space between ends can't be negative");
            }

        }
    }
}
