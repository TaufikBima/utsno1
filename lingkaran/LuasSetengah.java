
package lingkaran;

// Taufik Bima Maulana
// 20210040121
// TI21E

public class LuasSetengah {
    private Lingkaran lingkaran;
    
    public LuasSetengah(Lingkaran lingkaran){
        this.lingkaran = lingkaran;
    }
    
    public void hitung(){
        this.lingkaran.hitungLuas();
    }
    
    public void tampilkan(){
        this.lingkaran.tampilkanLuas();
    }
    
}