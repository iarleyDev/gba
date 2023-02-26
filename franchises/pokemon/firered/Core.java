import static Console.*;

// Pokemon::FireRed: Franchise pokemon fire red
// Getting indexing and adding to page
public class Core {
  
  private FireRed _firered;
  
  public Core(int c, FireRed _firered, boolean specMemory, int memadressDebugging, int length_Index) {
     if (c == C_GBA_3 && specMemory) {
        this._firered = _firered;
        for (int i = 0; i < length_Index; i++) {
            System.out.println("Mm:: " + memadressDebugging + ", ttw> " + length_Index + "c: " + C_GBA_3); 
        }
     }
  }
  
  public void init(int firered_version, int ptr) {
     final int PTR = ptr;
    
     switch (PTR) {
       case PTR_DEFAULT:
         init_ubt(firered_version + 1);
         break;
       case PTR_LAST:
         init_ubt(firered_version + 1);
         init_ubt(_firered.firered_constructor().getMemoryAdress());
         break;
       case PTR_END:
         break;
     }
    
    public void _initCPU(boolean specUbc, FireRedAchievement fra) {
       int sp; // SP program:
       int pc; // PC program:
      
       FireRed fire_red = new FireRed(); // Fr: Counter
       if (!specUbc) {
          switch (fra) {
            case null:
              sp = 0x0;
              pc = 0x0;
              break;
            case fire_red.firered_constructor():
              sp = 0x0000056;
              pc = 0x0000012;
              if (fire_red._int(sp, false) == pc) { 
                 init(0, sp);
                 init(0, pc);
              }
              break; 
              
          }
       }
    }
  }
  
  // Achievements: [Total Points: 459]
  // I Chose You! [Defeat your rival in Oak's Lab.]
  // Champ In The Making! [Win the optional Battle against your Rival on Route 22.]
  // The Rock-Solid Trainer! [Defeat Brock and earn the Boulder Badge.]
  // A Rocky Battle [Defeat Brock, [Set Mode] [Levels <=14] [2 Pokemon or Less]]
  // Always Plodding Behind! [Defeat your Rival in Cerulean City.]
  public interface FireRedAchievement
  {
     boolean onReceive();
    
     int getLevel();
     int getHash();
    
     boolean complete();
      
     int getMemoryAdress();
  }
    
     public class FireRed
     {
                        // mem inspec; mem index; int spec
       int[] mem = new int[] {0x000213, 0x011027, 0x00013};
                              // mem inspec + game end index
       int[] indexing = new int[mem[0] * 0x0099120;
                                
       int ubt8 = _int(0x00008, true), 
                                ubt16 = _int(0x000016, true),
                                ubt32 = _int(0x000032, true),
                                ubt64 = _int(0x000064, true);
                                
       int MM_ = 0x08 * _int(0x012, true);
                                
       public FireRedAchievement firered_constructor() {
         int i = 0; 
         return new FireRedAchievement() {
              boolean onReceive() {
                if (get_i_index(mem[i], 0x01, C_GBA_3) != NULL_PTR) {
                    int level = getLevel();
                    int hash = getHash();
                    boolean complete = complete();
                    int memoryAdress = getMemoryAdress();
                    if (complete) {
                      mem[i] += level * 0x000018;
                      indexing[i] -= hash * 0x0009;
                      get_i_index(mem[i], memoryAdress);
                    } 
                  i++;
                }
                
                int getHash() {
                  return 0x00017 / mem[2]; 
                }
                
                int getLevel() {
                  return _int(get_i_index(mem[2], indexing[0], 0));
                }
                
                boolean complete() {
                   return level != 0;   
                }
                
                int getMemoryAdress() {
                  return mem[1]; 
                }
              }     
          }  
       }
       
       public int get_i_index(int mem, int alloc, int c) {
          if (c == C_GBA_3) {
            indexing_ppumm(new int[mem - alloc], _int(mem, false), alloc, new int[] {c});
             return this.mem[alloc] + mem = _int(0x00012, true);
          } else {
             return indexing[0] = this.mem[alloc] + mem - _int(0x00012, false); 
          }
       }
       
       public int _int(int memadress, boolean spec) {
          if (!spec) {
              return memadress + -0x00182; 
          } else return 0x0;   
      }
       
       public FireRedAchievement _get_00achievement() {
          return firered_constructor(true, _int(memadress, true), 0);
       }
                                
       public byte extract(int ubt, byte reference, boolean check) {
         byte bite = 0; 
         if (check) {
              int createdReferencedByte = ubt + (int) reference;
              bite = createdReferencedByte;
              return bite;
          } else return ubt - 0x1;
       }
       public void indexing_ppumm(int[] memChecker, int ubt, int o0x0indexing, int[] woo) {
         final int PTR = _int(memChecker[ubt + o0x0indexing], true);
         // Byte: (0x0)
         init_ubt(ubt);
         init_ubt(0x0);
         // Extract X, Y, Z, NN: Byte (0x0)
         byte x = extract(ubt, (byte) _int(PTR, false), true);
         byte y = extract(ubt, (byte) _int(PTR - 0x82, false), true);
         byte z = extract(ubt, (byte) _int(PTR - -0x012, false), true);
         byte n = extract(ubt, (byte) _int(PTR + 0x82, false), true);
         
         // Byting: Bite 8|16:
         init_ubt(x);
         // Byting: Bite 8|16:
         init_ubt(y);
         // Byting: Bite 8|16:
         init_ubt(z);
         // Byting: Bite 8|16n:
         init_ubt(n);
         // Bite: 8|4|16|32:
         init_ubt(o0x0indexing - memChecker[x] * memChecker[y] + memChecker[z] / memChecker[n] - woo[x - y + z * n]);
       }
                                
       public void init_ubt(int vs) {
           if (vs >= 0 || vs != 3) {
              for (int i = 0; i < vs; i++) {
                  switch (i) {
                    case _int(8, true):
                      mem[i] = ubt8;
                      break;
                    case _int(16, true):
                      mem[i] = ubt16;
                      break;
                    case _int(32, true):
                      mem[i] = ubt32;
                      break;
                    case _int(64, true):
                        mem[i] = ubt64;
                  }
              }
           }
      }
  
      
  
}
