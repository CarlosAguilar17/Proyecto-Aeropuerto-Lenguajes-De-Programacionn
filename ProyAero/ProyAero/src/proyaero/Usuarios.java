/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyaero;

/**
 *
 * @author carlo
 */
public class Usuarios {
    private String User;
    private String Pass;
    private int Admin;

    public Usuarios (String User, String Pass, int Admin) {
        this.User = User;
        this.Pass = Pass;
        this.Admin = Admin;
    }

    public String getDato1() {
        return User;
    }

    public String getDato2() {
        return Pass;
    }

    public int getDato3() {
        return Admin;
    }
}
