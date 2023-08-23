package com.digitalbricklayer.encaspulamento;

public class Gerente {

    private Double salarioBase;

    private Double multiplicadorCargo;

    public Double calculaSalario() {
        return multiplicadorCargo * salarioBase;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) throws Exception {
        if (salarioBase <= 1200){
            throw new Exception("salarioBase não pode ser menor do que um");
        }
        this.salarioBase = salarioBase;
    }

    public Double getMultiplicadorCargo() {
        return multiplicadorCargo;
    }

    public void setMultiplicadorCargo(Double multiplicadorCargo) throws Exception {
        if (multiplicadorCargo <= 0){
            throw new Exception("Multiplicador não pode ser menor do que um");
        }
        this.multiplicadorCargo = multiplicadorCargo;
    }
}
