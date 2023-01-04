package com.uas.prakrplbo;

public class Evolusi extends Monster{
    private Monster monster1;
    private Monster monster2;
    public Evolusi(Monster monster1, Monster monster2){
        super(monster1.getNama()+" "+monster2.getNama());
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    @Override
    public String bersuara() {
        StringBuilder suara= new StringBuilder();
        String suara1 = monster1.bersuara();
        String suara2 = monster2.bersuara();
        for(int i=0;i<suara1.length();i++){
            if(i%2 == 0){
                suara.append(suara2.charAt(i));
            }if(i%2 == 1){
                suara.append(suara1.charAt(i));
            }
        }

        return suara.toString();
    }

    @Override
    public String bergerak() {
        return super.getNama()+" "+monster2.bergerak()+"...";
    }
}
