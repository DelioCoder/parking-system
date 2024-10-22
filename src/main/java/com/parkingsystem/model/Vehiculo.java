package com.parkingsystem.model;

/**
 *
 * @author david
 */
public class Vehiculo {
    
    private int id;
    private String placa_veh;
    private String color_veh;
    private String marca_veh;
    private String año_veh;
    private int id_conductor;
    
    public Vehiculo() { }

    public Vehiculo(int id, String placa_veh, String color_veh, String marca_veh, String año_veh, int id_conductor) {
        this.id = id;
        this.placa_veh = placa_veh;
        this.color_veh = color_veh;
        this.marca_veh = marca_veh;
        this.año_veh = año_veh;
        this.id_conductor = id_conductor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca_veh() {
        return placa_veh;
    }

    public void setPlaca_veh(String placa_veh) {
        this.placa_veh = placa_veh;
    }

    public String getColor_veh() {
        return color_veh;
    }

    public void setColor_veh(String color_veh) {
        this.color_veh = color_veh;
    }

    public String getMarca_veh() {
        return marca_veh;
    }

    public void setMarca_veh(String marca_veh) {
        this.marca_veh = marca_veh;
    }

    public String getAño_veh() {
        return año_veh;
    }

    public void setAño_veh(String año_veh) {
        this.año_veh = año_veh;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", placa_veh=" + placa_veh + ", color_veh=" + color_veh + ", marca_veh=" + marca_veh + ", a\u00f1o_veh=" + año_veh + ", id_conductor=" + id_conductor + '}';
    }
    
}
