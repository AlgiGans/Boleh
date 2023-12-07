/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author ASUS
 */
public class manager_1 extends gaji_1 {
    String Id,nm;
    public manager_1() {
        GajiPokok = 3400000;
        HrHadir = 12000;
        HrLembur = 26000;
    }
    
    void nm(String nm){
        this.nm = nm;
    }
    void Id(String Id){
        this.Id = Id;
    }
    String Id(){
        return Id;
    }

    @Override
    int hitGaji() {
       GajiTotal = GajiPokok + (jmlhadir * HrHadir)+(Jlembur * HrLembur);
        return GajiTotal;
    }

    @Override
    public void Jlembur(int Jlembur) {
        this.Jlembur = Jlembur;
    }

    @Override
    public void Jmlhadir(int jmlhadir) {
       this.jmlhadir = jmlhadir;
    }
   

}
