package pixelmon.battles.status;

import net.minecraft.util.DamageSource;
import pixelmon.RandomHelper;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class Wrap extends StatusBase {
	
	int turnsToGo;
	
	public Wrap() {
		super(StatusType.Wrap, true, false, false);
		turnsToGo = RandomHelper.getRandomNumberBetween(4, 5);
	}
	@Override
	public void applyRepeatedEffect(EntityPixelmon entityPixelmon, EntityPixelmon entityPixelmon2) throws Exception {
	    if (turnsToGo>0){
	    	entityPixelmon.attackEntityFrom(DamageSource.causeMobDamage(entityPixelmon2), entityPixelmon.getMaxHealth()/16);
	    	ChatHandler.sendBattleMessage(entityPixelmon.getOwner(), entityPixelmon2.getOwner(), entityPixelmon.getNickname() + " was hurt by wrap!");
	    	return;
	    	}
		ChatHandler.sendBattleMessage(entityPixelmon.getOwner(), entityPixelmon2.getOwner(), entityPixelmon.getNickname() + " was freed from wrap!");
		entityPixelmon.status.remove(this);
	    }
	
}
