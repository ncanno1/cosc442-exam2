/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
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
 * Created on Oct 20, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.AmmoType;
import megamek.common.TechConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class CLLongTom.
 *
 * @author Sebastian Brocks
 */
public class CLLongTom extends ArtilleryWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2543864156188708488L;

    /**
     * Instantiates a new CL long tom.
     */
    public CLLongTom() {
        super();
        techLevel = TechConstants.T_CLAN_ADVANCED;
        name = "Long Tom";
        setInternalName("CLLongTom");
        addLookupName("CLLongTomArtillery");
        addLookupName("Clan Long Tom");
        heat = 20;
        rackSize = 25;
        ammoType = AmmoType.T_LONG_TOM;
        shortRange = 1; //
        mediumRange = 2;
        longRange = 30;
        extremeRange = 30; // No extreme range.
        tonnage = 30f;
        criticals = 30;
        bv = 560;
        cost = 450000;
    }

}
