/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 * 
 *  This program is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU General Public License as published by the Free 
 *  Software Foundation; either version 2 of the License, or (at your option) 
 *  any later version.
 * 
 *  This program is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 *  for more details.
 */
package megamek.common.weapons;

import megamek.common.TechConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class CLSRT6.
 *
 * @author Sebastian Brocks
 */
public class CLSRT6 extends SRTWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3714508566716721609L;

    /**
     * Instantiates a new CLSR t6.
     */
    public CLSRT6() {
        super();
        this.techLevel = TechConstants.T_CLAN_TW;
        this.name = "SRT 6";
        this.setInternalName("CLSRT6");
        this.addLookupName("Clan SRT-6");
        this.addLookupName("Clan SRT 6");
        this.heat = 4;
        this.rackSize = 6;
        this.waterShortRange = 3;
        this.waterMediumRange = 6;
        this.waterLongRange = 9;
        this.waterExtremeRange = 12;
        this.tonnage = 1.5f;
        this.criticals = 1;
        this.bv = 59;
        this.flags |= F_NO_FIRES;
        this.cost = 80000;
    }
}
