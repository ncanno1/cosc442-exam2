/* MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
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
/*
 * Created on Sep 25, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.TechConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class NAC25Weapon.
 *
 * @author Jay Lawson
 */
public class NAC25Weapon extends NavalACWeapon {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8756042527483383101L;

    /**
     * Instantiates a new NA c25 weapon.
     */
    public NAC25Weapon() {
        super();
        this.techLevel = TechConstants.T_IS_TW_NON_BOX;
        this.name = "Naval AC 25";
        this.setInternalName(this.name);
        this.addLookupName("NAC25");
        this.heat = 85;
        this.damage = 25;
        this.rackSize = 25;
        this.shortRange = 10;
        this.mediumRange = 20;
        this.longRange = 30;
        this.extremeRange = 40;
        this.tonnage = 3000.0f;
        this.bv = 4740;
        this.cost = 7500000;
        this.shortAV = 25;
        this.medAV = 25;
        this.longAV = 25;
        this.maxRange = RANGE_LONG;
    
    }
}
