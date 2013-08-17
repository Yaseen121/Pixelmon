package pixelmon.battles.status;

import net.minecraft.util.DamageSource;
import pixelmon.RandomHelper;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class Bind extends StatusBase {

	int turnsToGo;
	
	public Bind() {
		super(StatusType.Bind, true, false, false);
		turnsToGo = RandomHelper.getRandomNumberBetween(4, 5);
	}
    @Override
	public void applyRepeatedEffect(EntityPixelmon entityPixelmon, EntityPixelmon entityPixelmon2) throws Exception {
    	if (turnsToGo>0){
    		entityPixelmon.attackEntityFrom(DamageSource.causeMobDamage(entityPixelmon2), entityPixelmon.getMaxHealth()/16);
    		ChatHandler.sendBattleMessage(entityPixelmon.getOwner(), entityPixelmon2.getOwner(), entityPixelmon.getNickname() + " was hurt by bind!");
    		return;
    		}
		ChatHandler.sendBattleMessage(entityPixelmon.getOwner(), entityPixelmon2.getOwner(), entityPixelmon.getNickname() + " was freed from bind!");
		entityPixelmon.status.remove(this);
    }
    public boolean stopsSwitching() {
    	  return true;
    	 }
}
