// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.behaviors.minion.move;

import org.terasology.engine.entitySystem.Component;
import org.terasology.engine.persistence.typeHandling.annotations.SerializedName;
import org.terasology.math.geom.Vector3f;
import org.terasology.pathfinding.model.Path;
import org.terasology.pathfinding.navgraph.WalkableBlock;

public class MinionMoveComponent implements Component {
    public Type type = Type.DIRECT;
    public Vector3f target;
    public boolean targetReached;
    public boolean breaking;
    public transient Path path;
    public int currentIndex;
    public transient WalkableBlock currentBlock;
    public transient boolean horizontalCollision;
    public transient boolean jumpMode;
    public transient float jumpCooldown;
    public enum Type {
        @SerializedName("direct")
        DIRECT,
        @SerializedName("path")
        PATH
    }

}
