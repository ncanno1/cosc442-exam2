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
 * The Class ISLRM3OS.
 *
 * @author Sebastian Brocks
 */
public class ISLRM3OS extends LRMWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 435741447089925036L;

    /**
     * Instantiates a new ISLR m3 os.
     */
    public ISLRM3OS() {
        super();
        this.techLevel = TechConstants.T_IS_TW_NON_BOX;
        this.name = "LRM 3 (OS)";
        this.setInternalName(this.name);
        this.addLookupName("ISLRM3OS");
        this.rackSize = 3;
        this.minimumRange = 6;
        this.shortRange = 7;
        this.mediumRange = 14;
        this.longRange = 21;
        this.extremeRange = 28;
        this.bv = 6;
        this.flags |= F_ONESHOT;
    }
}
