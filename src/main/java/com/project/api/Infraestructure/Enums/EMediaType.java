package com.project.api.Infraestructure.Enums;

public enum EMediaType {
    FichaTecnica(1),
    Imagen(2),
    Logo(3);
    private int value;
    EMediaType (int value){
        this.value= value;
    }
    public int getValue(){
        return this.value;
    }


}
