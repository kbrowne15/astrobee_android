
/* Copyright (c) 2017, United States Government, as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 *
 * All rights reserved.
 *
 * The Astrobee platform is licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package gov.nasa.arc.astrobee.cpu_monitor;

import java.util.ArrayList;

/**
 * Java class abstraction for the /proc/stat file
 */
public class StatFile {

    /**
     * The very first line "cpu" aggregates the numbers in all of the other "cpuN" lines.
     * These numbers identify the amount of time the CPU has spent performing different kinds of work.
     * Time units are in USER_HZ or Jiffies (typically hundredths of a second).
     */
    private ArrayList<CpuLoad> cpus;

    public StatFile(){
        cpus = new ArrayList<CpuLoad>();
    }

    public ArrayList<CpuLoad> getCpus() {
        return cpus;
    }

    public void setCpus(ArrayList<CpuLoad> cpus) {
        this.cpus = cpus;
    }

}
