package org.Gorbachev.HomeWork_01;

public class Door {

    private boolean hasPrize;
    private boolean isOpen;

    public Door(boolean hasPrize) {
        this.hasPrize = hasPrize;
        this.isOpen = false;
    }

    public boolean hasPrize() {
        return hasPrize;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
