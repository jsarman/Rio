/*
 * Copyright to the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rioproject.tools.ui.util;

import org.rioproject.tools.ui.NotificationUtility;
import org.rioproject.tools.ui.NotificationUtilityListener;

import javax.swing.*;

/**
 * @author Dennis Reedy
 */
public class NotificationNode implements NotificationUtilityListener {
    JLabel label;
    NotificationUtility[] utility;

    public NotificationNode(final NotificationUtility... utility) {
        this.utility = utility;
    }

    public void setLabel(final JLabel label) {
        this.label = label;
    }

    public int getCount() {
        int count = 0;
        for (NotificationUtility nu : utility) {
            count += nu.getTotalItemCount();
        }
        return count;
    }

    public void notify(final NotificationUtility nu) {
        //getCount();
        if (label != null)
            label.repaint();
    }
}
