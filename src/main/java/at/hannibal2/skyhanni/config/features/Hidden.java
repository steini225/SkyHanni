package at.hannibal2.skyhanni.config.features;

import at.hannibal2.skyhanni.features.garden.CropType;
import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hidden {

    @Expose
    public String apiKey = "";

    @Expose
    public String currentPet = "";

    @Expose
    public Map<String, Long> minionLastClick = new HashMap<>();

    @Expose
    public Map<String, String> minionName = new HashMap<>();

    @Expose
    public List<String> crimsonIsleQuests = new ArrayList<>();

    @Expose
    public int crimsonIsleLatestTrophyFishInInventory = 0;

    @Expose
    public List<String> crimsonIsleMiniBossesDoneToday = new ArrayList<>();

    @Expose
    public List<String> crimsonIsleKuudraTiersDone = new ArrayList<>();

    @Expose
    public Map<CropType, Long> gardenCropCounter = new HashMap<>();

    @Expose
    public Map<CropType, Integer> gardenCropsPerSecond = new HashMap<>();

    @Expose
    public int gardenExp = -1;

    @Expose
    public Map<String, Integer> gardenDicerRngDrops = new HashMap<>();

    @Expose
    public Map<Long, List<CropType>> gardenJacobFarmingContestTimes = new HashMap<>();

    @Expose
    public Map<String, Integer> gardenFarmingArmorDrops = new HashMap<>();
}
