package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {
    @NotNull
    private int menuId;

    @NotNull
    private int cheeseId;

    private Iterable<Cheese> cheeses;

    private Menu menu;

    public AddMenuItemForm(){}

    public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu){
        this.cheeses = cheeses;
        this.menu = menu;
    }

    public int getMenuId(){
        return this.menuId;
    }

    public Iterable<Cheese> getCheeses(){
        return this.cheeses;
    }

    public Menu getMenu(){
        return this.menu;
    }

    public int getCheeseId(){
        return this.cheeseId;
    }
}
