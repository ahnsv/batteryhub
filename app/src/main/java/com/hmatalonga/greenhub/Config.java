/*
 * Copyright (c) 2011-2016, AMP Lab and University of Helsinki
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those
 * of the authors and should not be interpreted as representing official policies,
 * either expressed or implied, of the FreeBSD Project.
 *
 * -------------------------------------------------------------------------------
 *
 * Copyright (C) 2016 Hugo Matalonga & João Paulo Fernandes
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

package com.hmatalonga.greenhub;

/**
 * Config fields.
 * Created by hugo on 24-03-2016.
 */
public final class Config {
    public static final boolean DEBUG = true;

    public static final String SERVER_STATUS_URL = "https://greenhubproject.org/";
    public static final String SERVER_URL_DEFAULT = "none";
    public static final String SERVER_URL_DEVELOPMENT = "http://192.168.1.55:8080";

    public static final int DATABASE_VERSION = 4;

    public static final String IMPORTANCE_NOT_RUNNING = "Not Running";
    public static final String IMPORTANCE_UNINSTALLED = "uninstalled";
    public static final String IMPORTANCE_DISABLED = "disabled";
    public static final String IMPORTANCE_INSTALLED = "installed";
    public static final String IMPORTANCE_REPLACED = "replaced";
    public static final int IMPORTANCE_APP = 9999;

    public static final String BATTERY_SOURCE_DEFAULT =
            "/sys/class/power_supply/battery/current_now";
    public static final String BATTERY_SOURCE_ALTERNATIVE =
            "/sys/devices/platform/battery/power_supply/battery/BatteryAverageCurrent";

    public static final String BATTERY_STATS_SOURCE_DEFAULT =
            "/sys/class/power_supply/battery/uevent";
    public static final String BATTERY_CHARGE_FULL = "POWER_SUPPLY_CHARGE_FULL";  // Battery Full Capacity in uAh
    public static final String BATTERY_CHARGE_FULL_DESIGN = "POWER_SUPPLY_CHARGE_FULL_DESIGN";
    public static final String BATTERY_ENERGY_FULL = "POWER_SUPPLY_ENERGY_FULL";  // Battery Full Capacity in uWh
    public static final String BATTERY_ENERGY_FULL_DESIGN = "POWER_SUPPLY_CHARGE_FULL_DESIGN";
    public static final String BATTERY_VOLTAGE_NOW = "POWER_SUPPLY_VOLTAGE_NOW";  // The circuit voltage at the moment
    public static final String BATTERY_CURRENT_NOW = "POWER_SUPPLY_CURRENT_NOW";  // The Current at the moment in uA
    public static final String BATTERY_ENERGY_NOW = "POWER_SUPPLY_ENERGY_NOW";   // The device remaining capacity in uAh
    public static final String BATTERY_CAPACITY = "POWER_SUPPLY_CAPACITY";     // The battery capacity percentage (1-100)

    public static final int DEFAULT_USB_CHARGE_RATE = 500;  // assume that, in one hours, it charges 500 mA
    public static final int DEFAULT_AC_CHARGE_RATE = 1500;  // assume that, in one hours, it charges 1500 mA
    public static final int DEFAULT_WIRELESS_CHARGE_RATE = 500;  // assume that, in one hours, it charges 500 mA
    public static final int DEFAULT_DISCHARGE_RATE = 200;  // assume a continuous discharge of 200 mA per hour

    public static final String DATA_HISTORY_DEFAULT = "4";

    public static final int UPLOAD_MAX_TRIES = 3;
    public static final String UPLOAD_DEFAULT_RATE = "20";

    public static final int STARTER_MESSAGE_ID = 0;

    public static final int STARTUP_CURRENT_INTERVAL = 2000;
    public static final int REFRESH_CURRENT_INTERVAL = 5000;
    public static final int REFRESH_MEMORY_INTERVAL = 10000;
    public static final int REFRESH_STATUS_BAR_INTERVAL = REFRESH_CURRENT_INTERVAL * 6;
    public static final int REFRESH_STATUS_ERROR = REFRESH_CURRENT_INTERVAL * 2;

    public static final String NOTIFICATION_DEFAULT_TEMPERATURE_RATE = "5";
    public static final String NOTIFICATION_DEFAULT_TEMPERATURE_WARNING = "35";
    public static final String NOTIFICATION_DEFAULT_TEMPERATURE_HIGH = "45";
    public static final double BATTERY_LOW_LEVEL = 0.2;

    public static final int PERMISSION_READ_PHONE_STATE = 1;
    public static final int PERMISSION_ACCESS_COARSE_LOCATION = 2;
    public static final int PERMISSION_ACCESS_FINE_LOCATION = 3;

    public static final String NOTIFICATION_DEFAULT_PRIORITY = "0";
    public static final int NOTIFICATION_BATTERY_STATUS = 1001;
    public static final int NOTIFICATION_BATTERY_FULL = 1002;
    public static final int NOTIFICATION_BATTERY_LOW = 1003;
    public static final int NOTIFICATION_TEMPERATURE_WARNING = 1004;
    public static final int NOTIFICATION_TEMPERATURE_HIGH = 1005;
    public static final int NOTIFICATION_MESSAGE_NEW = 1006;


    public static final int PENDING_REMOVAL_TIMEOUT = 1500; // 1.5s
    public static final int KILL_APP_TIMEOUT = 15000; // 15s
    public static final int SORT_BY_MEMORY = 1;
    public static final int SORT_BY_NAME = 2;

    public static final int BATTERY_CAPACITY_SAMPLES_SIZE = 10;
}
