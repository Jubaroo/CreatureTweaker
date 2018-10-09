
package org.jubaroo.mods.creaturetweaker.configurator;

import com.wurmonline.server.creatures.CreatureTemplate;
import com.wurmonline.server.creatures.CreatureTemplateFactory;
import com.wurmonline.server.creatures.CreatureTemplateIds;
import com.wurmonline.server.skills.SkillList;
import com.wurmonline.server.skills.SkillsFactory;
import org.gotti.wurmunlimited.modloader.ReflectionUtil;
import org.jubaroo.mods.creaturetweaker.Constants;

class Skills {

    static void setBrownCowSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.COW_BROWN_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Brown cow");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.brownCowBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.brownCowBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.brownCowBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.brownCowMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.brownCowMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.brownCowSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.brownCowSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.brownCowWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setBlackWolfSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.WOLF_BLACK_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Black wolf");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.blackWolfBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.blackWolfBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.blackWolfBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.blackWolfMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.blackWolfMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.blackWolfSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.blackWolfSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.blackWolfWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setTrollSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.TROLL_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Troll");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.trollBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.trollBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.trollBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.trollMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.trollMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.trollSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.trollSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.trollWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setBrownBearSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.BEAR_BROWN_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Brown bear");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.brownBearBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.brownBearBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.brownBearBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.brownBearMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.brownBearMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.brownBearSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.brownBearSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.brownBearWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setBlackBearSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.BEAR_BLACK_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Black bear");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.blackBearBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.blackBearBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.blackBearBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.blackBearMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.blackBearMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.blackBearSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.blackBearSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.blackBearWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setLargeRatSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.RAT_LARGE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Large rat");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.largeRatBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.largeRatBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.largeRatBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.largeRatMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.largeRatMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.largeRatSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.largeRatSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.largeRatWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setCaveBugSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.CAVE_BUG_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Cave bug");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.caveBugBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.caveBugBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.caveBugBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.caveBugMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.caveBugMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.caveBugSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.caveBugSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.caveBugWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setMountainLionSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.LION_MOUNTAIN_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Mountain lion");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.mountainLionBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.mountainLionBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.mountainLionBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.mountainLionMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.mountainLionMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.mountainLionSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.mountainLionSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.mountainLionWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setWildCatSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.CAT_WILD_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Wild cat");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.wildCatBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.wildCatBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.wildCatBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.wildCatMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.wildCatMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.wildCatSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.wildCatSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.wildCatWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRedDragonSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DRAGON_RED_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Red dragon");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.redDragonBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.redDragonBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.redDragonBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.redDragonMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.redDragonMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.redDragonSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.redDragonSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.redDragonWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setGreenDragonHatchlingSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DRAKE_GREEN_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Green dragon hatchling");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.greenDragonHatchlingBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.greenDragonHatchlingBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.greenDragonHatchlingBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.greenDragonHatchlingMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.greenDragonHatchlingMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.greenDragonHatchlingSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.greenDragonHatchlingSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.greenDragonHatchlingWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setBlackDragonHatchlingSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DRAKE_BLACK_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Black dragon hatchling");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.blackDragonHatchlingBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.blackDragonHatchlingBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.blackDragonHatchlingBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.blackDragonHatchlingMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.blackDragonHatchlingMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.blackDragonHatchlingSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.blackDragonHatchlingSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.blackDragonHatchlingWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setWhiteDragonHatchlingSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DRAKE_WHITE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("White dragon hatchling");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.whiteDragonHatchlingBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.whiteDragonHatchlingBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.whiteDragonHatchlingBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.whiteDragonHatchlingMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.whiteDragonHatchlingMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.whiteDragonHatchlingSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.whiteDragonHatchlingSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.whiteDragonHatchlingWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setForestGiantSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.FOREST_GIANT_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Forest giant");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.forestGiantBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.forestGiantBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.forestGiantBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.forestGiantMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.forestGiantMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.forestGiantSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.forestGiantSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.forestGiantWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setUnicornSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.UNICORN_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Unicorn");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.unicornBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.unicornBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.unicornBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.unicornMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.unicornMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.unicornSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.unicornSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.unicornWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setKyklopsSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.CYCLOPS_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Kyklops");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.kyklopsBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.kyklopsBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.kyklopsBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.kyklopsMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.kyklopsMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.kyklopsSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.kyklopsSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.kyklopsWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setGoblinSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.GOBLIN_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Goblin");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.goblinBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.goblinBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.goblinBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.goblinMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.goblinMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.goblinSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.goblinSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.goblinWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setHugeSpiderSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.SPIDER_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Huge spider");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.hugeSpiderBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.hugeSpiderBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.hugeSpiderBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.hugeSpiderMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.hugeSpiderMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.hugeSpiderSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.hugeSpiderSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.hugeSpiderWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setLavaSpiderSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.LAVA_SPIDER_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Lava spider");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.lavaSpiderBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.lavaSpiderBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.lavaSpiderBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.lavaSpiderMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.lavaSpiderMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.lavaSpiderSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.lavaSpiderSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.lavaSpiderWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setGoblinLeaderSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.GOBLIN_LEADER_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Goblin leader");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.goblinLeaderBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.goblinLeaderBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.goblinLeaderBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.goblinLeaderMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.goblinLeaderMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.goblinLeaderSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.goblinLeaderSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.goblinLeaderWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setTrollKingSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.TROLL_KING_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Troll king");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.trollKingBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.trollKingBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.trollKingBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.trollKingMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.trollKingMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.trollKingSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.trollKingSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.trollKingWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setWildBoarSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.BOAR_FO_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Wild boar");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.wildBoarBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.wildBoarBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.wildBoarBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.wildBoarMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.wildBoarMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.wildBoarSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.wildBoarSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.wildBoarWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setMountainGorillaSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.GORILLA_MAGRANON_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Mountain gorilla");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.mountainGorillaBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.mountainGorillaBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.mountainGorillaBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.mountainGorillaMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.mountainGorillaMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.mountainGorillaSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.mountainGorillaSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.mountainGorillaWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setAnacondaSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.ANACONDA_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Anaconda");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.anacondaBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.anacondaBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.anacondaBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.anacondaMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.anacondaMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.anacondaSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.anacondaSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.anacondaWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setPigSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.PIG_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Pig");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.pigBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.pigBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.pigBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.pigMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.pigMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.pigSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.pigSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.pigWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setHenSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.HEN_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Hen");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.henBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.henBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.henBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.henMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.henMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.henSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.henSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.henWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRoosterSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.ROOSTER_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Rooster");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.roosterBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.roosterBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.roosterBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.roosterMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.roosterMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.roosterSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.roosterSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.roosterWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setChickenSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.CHICKEN_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Chicken");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.chickenBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.chickenBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.chickenBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.chickenMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.chickenMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.chickenSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.chickenSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.chickenWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setDogSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DOG_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Dog");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.dogBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.dogBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.dogBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.dogMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.dogMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.dogSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.dogSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.dogWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setCalfSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.CALF_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Calf");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.calfBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.calfBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.calfBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.calfMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.calfMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.calfSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.calfSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.calfWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setBullSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.BULL_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Bull");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.bullBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.bullBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.bullBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.bullMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.bullMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.bullSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.bullSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.bullWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setBisonSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.BISON_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Bison");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.bisonBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.bisonBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.bisonBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.bisonMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.bisonMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.bisonSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.bisonSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.bisonWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setFoalSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.FOAL_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Foal");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.foalBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.foalBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.foalBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.foalMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.foalMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.foalSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.foalSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.foalWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setDeerSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DEER_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Deer");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.deerBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.deerBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.deerBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.deerMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.deerMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.deerSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.deerSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.deerWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setPheasantSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.PHEASANT_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Pheasant");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.pheasantBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.pheasantBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.pheasantBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.pheasantMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.pheasantMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.pheasantSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.pheasantSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.pheasantWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setLavaFiendSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.LAVA_CREATURE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Lava fiend");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.lavaFiendBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.lavaFiendBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.lavaFiendBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.lavaFiendMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.lavaFiendMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.lavaFiendSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.lavaFiendSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.lavaFiendWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setCrocodileSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.CROCODILE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Crocodile");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.crocodileBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.crocodileBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.crocodileBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.crocodileMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.crocodileMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.crocodileSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.crocodileSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.crocodileWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setScorpionSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.SCORPION_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Scorpion");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.scorpionBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.scorpionBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.scorpionBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.scorpionMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.scorpionMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.scorpionSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.scorpionSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.scorpionWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setAvengerOfTheLightSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.AVENGER_OF_LIGHT_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Avenger of the Light");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.avengerOfTheLightBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.avengerOfTheLightBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.avengerOfTheLightBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.avengerOfTheLightMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.avengerOfTheLightMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.avengerOfTheLightSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.avengerOfTheLightSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.avengerOfTheLightWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setZombieSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.ZOMBIE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Zombie");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.zombieBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.zombieBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.zombieBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.zombieMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.zombieMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.zombieSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.zombieSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.zombieWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setSeaSerpentSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.SEA_SERPENT_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Sea Serpent");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.seaSerpentBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.seaSerpentBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.seaSerpentBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.seaSerpentMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.seaSerpentMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.seaSerpentSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.seaSerpentSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.seaSerpentWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setHugeSharkSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.SHARK_HUGE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Huge shark");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.hugeSharkBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.hugeSharkBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.hugeSharkBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.hugeSharkMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.hugeSharkMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.hugeSharkSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.hugeSharkSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.hugeSharkWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setSolDemonSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DEMON_SOL_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Sol Demon");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.solDemonBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.solDemonBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.solDemonBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.solDemonMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.solDemonMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.solDemonSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.solDemonSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.solDemonWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setDeathcrawlerMinionSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DEATHCRAWLER_MINION_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Deathcrawler minion");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.deathcrawlerMinionBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.deathcrawlerMinionBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.deathcrawlerMinionBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.deathcrawlerMinionMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.deathcrawlerMinionMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.deathcrawlerMinionSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.deathcrawlerMinionSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.deathcrawlerMinionWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setSpawnOfUttachaSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.SPAWN_UTTACHA_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Spawn of Uttacha");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.spawnOfUttachaBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.spawnOfUttachaBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.spawnOfUttachaBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.spawnOfUttachaMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.spawnOfUttachaMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.spawnOfUttachaSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.spawnOfUttachaSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.spawnOfUttachaWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setSonOfNogumpSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.SON_OF_NOGUMP_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Son of Nogump");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.sonOfNogumpBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.sonOfNogumpBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.sonOfNogumpBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.sonOfNogumpMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.sonOfNogumpMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.sonOfNogumpSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.sonOfNogumpSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.sonOfNogumpWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setDrakespiritSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DRAKESPIRIT_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Drakespirit");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.drakespiritBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.drakespiritBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.drakespiritBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.drakespiritMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.drakespiritMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.drakespiritSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.drakespiritSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.drakespiritWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setEaglespiritSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.EAGLESPIRIT_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Eaglespirit");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.eaglespiritBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.eaglespiritBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.eaglespiritBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.eaglespiritMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.eaglespiritMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.eaglespiritSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.eaglespiritSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.eaglespiritWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setEpiphanyOfVynoraSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.EPIPHANY_VYNORA_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Epiphany of Vynora");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.epiphanyOfVynoraBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.epiphanyOfVynoraBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.epiphanyOfVynoraBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.epiphanyOfVynoraMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.epiphanyOfVynoraMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.epiphanyOfVynoraSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.epiphanyOfVynoraSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.epiphanyOfVynoraWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setJuggernautOfMagranonSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.MAGRANON_JUGGERNAUT_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Juggernaut of Magranon");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.juggernautOfMagranonBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.juggernautOfMagranonBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.juggernautOfMagranonBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.juggernautOfMagranonMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.juggernautOfMagranonMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.juggernautOfMagranonSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.juggernautOfMagranonSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.juggernautOfMagranonWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setManifestationOfFoSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.MANIFESTATION_FO_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Manifestation of Fo");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.manifestationOfFoBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.manifestationOfFoBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.manifestationOfFoBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.manifestationOfFoMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.manifestationOfFoMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.manifestationOfFoSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.manifestationOfFoSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.manifestationOfFoWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setIncarnationOfLibilaSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.INCARNATION_LIBILA_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Incarnation of Libila");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.incarnationOfLibilaBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.incarnationOfLibilaBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.incarnationOfLibilaBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.incarnationOfLibilaMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.incarnationOfLibilaMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.incarnationOfLibilaSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.incarnationOfLibilaSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.incarnationOfLibilaWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setHellHorseSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.HELL_HORSE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Hell Horse");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.hellHorseBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.hellHorseBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.hellHorseBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.hellHorseMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.hellHorseMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.hellHorseSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.hellHorseSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.hellHorseWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setHellHoundSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.HELL_HOUND_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Hell Hound");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.hellHoundBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.hellHoundBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.hellHoundBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.hellHoundMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.hellHoundMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.hellHoundSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.hellHoundSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.hellHoundWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setHellScorpiousSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.HELL_SCORPION_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Hell Scorpious");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.hellScorpiousBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.hellScorpiousBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.hellScorpiousBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.hellScorpiousMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.hellScorpiousMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.hellScorpiousSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.hellScorpiousSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.hellScorpiousWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setWorgSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.WORG_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Worg");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.worgBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.worgBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.worgBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.worgMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.worgMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.worgSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.worgSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.worgWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setSkeletonSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.SKELETON_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Skeleton");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.skeletonBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.skeletonBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.skeletonBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.skeletonMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.skeletonMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.skeletonSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.skeletonSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.skeletonWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setWraithSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.WRAITH_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Wraith");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.wraithBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.wraithBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.wraithBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.wraithMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.wraithMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.wraithSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.wraithSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.wraithWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setSealSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.SEAL_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Seal");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.sealBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.sealBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.sealBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.sealMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.sealMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.sealSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.sealSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.sealWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setTortoiseSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.TORTOISE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Tortoise");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.tortoiseBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.tortoiseBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.tortoiseBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.tortoiseMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.tortoiseMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.tortoiseSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.tortoiseSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.tortoiseWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setCrabSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.CRAB_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Crab");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.crabBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.crabBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.crabBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.crabMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.crabMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.crabSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.crabSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.crabWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setSheepSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.SHEEP_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Sheep");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.sheepBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.sheepBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.sheepBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.sheepMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.sheepMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.sheepSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.sheepSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.sheepWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setBlueWhaleSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.BLUE_WHALE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Blue whale");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.blueWhaleBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.blueWhaleBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.blueWhaleBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.blueWhaleMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.blueWhaleMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.blueWhaleSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.blueWhaleSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.blueWhaleWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setSealCubSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.SEAL_CUB_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Seal cub");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.sealCubBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.sealCubBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.sealCubBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.sealCubMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.sealCubMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.sealCubSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.sealCubSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.sealCubWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setDolphinSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DOLPHIN_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Dolphin");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.dolphinBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.dolphinBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.dolphinBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.dolphinMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.dolphinMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.dolphinSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.dolphinSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.dolphinWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setOctopusSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.OCTOPUS_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Octopus");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.octopusBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.octopusBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.octopusBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.octopusMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.octopusMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.octopusSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.octopusSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.octopusWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setLambSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.LAMB_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Lamb");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.lambBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.lambBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.lambBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.lambMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.lambMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.lambSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.lambSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.lambWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRamSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.RAM_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Ram");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.ramBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.ramBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.ramBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.ramMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.ramMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.ramSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.ramSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.ramWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setBlackDragonSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DRAGON_BLACK_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Black dragon");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.blackDragonBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.blackDragonBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.blackDragonBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.blackDragonMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.blackDragonMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.blackDragonSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.blackDragonSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.blackDragonWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setBlueDragonSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DRAGON_BLUE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Blue dragon");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.blueDragonBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.blueDragonBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.blueDragonBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.blueDragonMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.blueDragonMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.blueDragonSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.blueDragonSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.blueDragonWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setGreenDragonSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DRAGON_GREEN_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Green dragon");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.greenDragonBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.greenDragonBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.greenDragonBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.greenDragonMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.greenDragonMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.greenDragonSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.greenDragonSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.greenDragonWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setWhiteDragonSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DRAKE_WHITE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("White dragon");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.whiteDragonBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.whiteDragonBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.whiteDragonBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.whiteDragonMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.whiteDragonMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.whiteDragonSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.whiteDragonSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.whiteDragonWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setBlueDragonHatchlingSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DRAKE_BLUE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Blue dragon hatchling");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.blueDragonHatchlingBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.blueDragonHatchlingBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.blueDragonHatchlingBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.blueDragonHatchlingMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.blueDragonHatchlingMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.blueDragonHatchlingSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.blueDragonHatchlingSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.blueDragonHatchlingWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRedDragonHatchlingSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.DRAKE_RED_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Red dragon hatchling");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.redDragonHatchlingBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.redDragonHatchlingBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.redDragonHatchlingBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.redDragonHatchlingMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.redDragonHatchlingMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.redDragonHatchlingSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.redDragonHatchlingSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.redDragonHatchlingWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setFogSpiderSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.SPIDER_FOG_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Fog Spider");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.fogSpiderBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.fogSpiderBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.fogSpiderBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.fogSpiderMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.fogSpiderMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.fogSpiderSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.fogSpiderSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.fogSpiderWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRiftBeastSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.RIFT_JACKAL_ONE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Rift Beast");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.riftBeastBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.riftBeastBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.riftBeastBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.riftBeastMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.riftBeastMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.riftBeastSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.riftBeastSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.riftBeastWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRiftJackalSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.RIFT_JACKAL_TWO_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Rift Jackal");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.riftJackalBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.riftJackalBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.riftJackalBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.riftJackalMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.riftJackalMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.riftJackalSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.riftJackalSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.riftJackalWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRiftOgreSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.RIFT_JACKAL_THREE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Rift Ogre");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.riftOgreBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.riftOgreBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.riftOgreBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.riftOgreMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.riftOgreMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.riftOgreSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.riftOgreSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.riftOgreWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRiftWarmasterSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.RIFT_JACKAL_FOUR_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Rift Warmaster");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.riftWarmasterBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.riftWarmasterBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.riftWarmasterBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.riftWarmasterMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.riftWarmasterMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.riftWarmasterSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.riftWarmasterSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.riftWarmasterWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRiftOgreMageSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.RIFT_OGRE_MAGE_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Rift Ogre Mage");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.riftOgreMageBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.riftOgreMageBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.riftOgreMageBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.riftOgreMageMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.riftOgreMageMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.riftOgreMageSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.riftOgreMageSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.riftOgreMageWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRiftCasterSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.RIFT_JACKAL_CASTER_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Rift Caster");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.riftCasterBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.riftCasterBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.riftCasterBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.riftCasterMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.riftCasterMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.riftCasterSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.riftCasterSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.riftCasterWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRiftSummonerSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.RIFT_JACKAL_SUMMONER_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("Rift Summoner");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.riftSummonerBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.riftSummonerBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.riftSummonerBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.riftSummonerMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.riftSummonerMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.riftSummonerSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.riftSummonerSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.riftSummonerWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setNPCHumanSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.NPC_HUMAN_CID);
            if(template != null) {
                com.wurmonline.server.skills.Skills skills = SkillsFactory.createSkills("NPC Human");
                skills.learnTemp(SkillList.BODY_STRENGTH, Constants.npcHumanBodyStrength);
                skills.learnTemp(SkillList.BODY_CONTROL, Constants.npcHumanBodyControl);
                skills.learnTemp(SkillList.BODY_STAMINA, Constants.npcHumanBodyStamina);
                skills.learnTemp(SkillList.MIND_LOGICAL, Constants.npcHumanMindLogic);
                skills.learnTemp(SkillList.MIND_SPEED, Constants.npcHumanMindSpeed);
                skills.learnTemp(SkillList.SOUL_STRENGTH, Constants.npcHumanSoulStrength);
                skills.learnTemp(SkillList.SOUL_DEPTH, Constants.npcHumanSoulDepth);
                skills.learnTemp(SkillList.WEAPONLESS_FIGHTING, Constants.npcHumanWeaponlessFighting);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
