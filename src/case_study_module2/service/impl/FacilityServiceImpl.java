package case_study_module2.service.impl;

import case_study_module2.model.facility.Facility;
import case_study_module2.model.facility.House;
import case_study_module2.model.facility.Room;
import case_study_module2.model.facility.Villa;
import case_study_module2.service.IFacilityService;

import java.util.LinkedHashMap;

public class FacilityServiceImpl implements IFacilityService {
    public void addNewFacility(Facility facility, int number) {
        facilityMap.put(facility, number);
    }

    private static LinkedHashMap<Facility, Integer> facilityMap;

    static {
        facilityMap = new LinkedHashMap<>();
        facilityMap.put(new Villa("SVVL-0001", "Villa 1", "100", "500", "5", "High", "Free", "2", "1"), 0);
        facilityMap.put(new House("SVHO-0002", "House 1", "50", "400", "6", "High", "Free", "2"), 0);
        facilityMap.put(new Room("SVRO-0003", "Room 1", "50", "300", "7", "Normal", "Free"), 0);
    }


    @Override
    public void displayFacility() {
        for (Facility facility : facilityMap.keySet()) {
            System.out.println(facility);
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void displayFacilityMaintenance() {
        if (facilityMap != null) {
            for (Facility facility : facilityMap.keySet()) {
                if (facilityMap.get(facility) >= 5) {
                    System.out.println(facility);
                }
            }
        }
    }
}
