import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ArtifactPowerGenerator  implements ActionListener {

    JLabel label;
    JButton powerGenerator;

    JFrame frame;
    JPanel panel;
    JComboBox powers;


    public ArtifactPowerGenerator() {
        frame = new JFrame();

        powerGenerator = new JButton("Generate Power");
        powerGenerator.addActionListener(this);

        label = new JLabel("Select your power type and click the button to generate a random artifact power");

        String[] gemTypes = {"Abjuration", "Cataclysm", "Combat", "Conjuration", "Cursed", "Detection", "Divination", "Elemental Air", "Elemental Fire", "Elemental Water", "Elemental Earth", "Enchantment/Charm", "Fate and Fortune", "Healing", "Immunity", "Major Powers", "Minor Powers", "Movement", "Offensive Powers", "Nature", "Necromantic", "Personal Enhancements", "Planar", "Protection", "Divination Results"};
        powers = new JComboBox(gemTypes);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        panel.setLayout(new GridLayout(0, 1));
        
        panel.add(label);
        panel.add((powers));
        panel.add(powerGenerator);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Artifact Powers");
        frame.pack();
        frame.setVisible(true);
    }

    public static String frame() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "";
                break;
            case 2:
                result = "";
                break;
            case 3:
                result = "";
                break;
            case 4:
                result = "";
                break;
            case 5:
                result = "";
                break;
            case 6:
                result = "";
                break;
            case 7:
                result = "";
                break;
            case 8:
                result = "";
                break;
            case 9:
                result = "";
                break;
            case 10:
                result = "";
                break;
            case 11:
                result = "";
                break;
            case 12:
                result = "";
                break;
            case 13:
                result = "";
                break;
            case 14:
                result = "";
                break;
            case 15:
                result = "";
                break;
            case 16:
                result = "";
                break;
            case 17:
                result = "";
                break;
            case 18:
                result = "";
                break;
            case 19:
                result = "";
                break;
            case 20:
                result = "";
                break;
        }
        return result;
    }

    public static String abjuration() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast abjure (3/day";
                break;
            case 2:
                result = "Cast avoidance between a creature and the user (1/day)";
                break;
            case 3:
                result = "Cast banishment by touch (1/week)";
                break;
            case 4:
                result = "Instantly dismiss an elemental (1/week)";
                break;
            case 5:
                result = "Cast dismissal upon any planar creature by touch (1/week)";
                break;
            case 6:
                result = "Cast dispel evil/dispel good (1/day)";
                break;
            case 7:
                result = "Cast dispel magic by touch (1/day)";
                break;
            case 8:
                result = "Cast holy word/unholy word (1 /week)";
                break;
            case 9:
                result = "Cast Homung's random dispatcher by touch (1/week)";
                break;
            case 10:
                result = "Cast imprisonment/freedom by touch. Imprisoned creatures are freed by naming them (1/month).";
                break;
            case 11:
                result = "Cast knock (3/day)";
                break;
            case 12:
                result = "Cast lower resistance (7/day)";
                break;
            case 13:
                result = "Have minor spell turning continually in effect while the artifact is in hand. Roll Id4 to determine the maximum level of the spell turned.";
                break;
            case 14:
                result = "Cast purify food & drink on all items within a 10' radius of the artifact (7/day)";
                break;
            case 15:
                result = "Cast remove curse by touch (3/day)";
                break;
            case 16:
                result = "Have repel insects in a 10' radius in constant effect while the artifact is held";
                break;
            case 17:
                result = "Cast repulsion upon one named creature (1/week)";
                break;
            case 18:
                result = "Cast spell turning for two turns duration (1/day)";
                break;
            case 19:
                result = "Dispel illusions within a 60' radius (3/day)";
                break;
            case 20:
                result = "Have turn wood continually in effect while the artifact is in hand";
                break;
        }
        return result;
    }

    public static String cataclysm() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast acid storm to rain down upon the area of effect for two full turns";
                break;
            case 2:
                result = "Create a. permanent aura of desolation that settles over the area of effect. Individuals of good alignment are haunted by terrifying dreams and suffer -2 penalties to THAC0 and saving throws while evil creatures gain +2 penalties to the same. Plants twist and wither, crops fail, and herds grow sickly.";
                break;
            case 3:
                result = "Blanket the area of effect with a blizzard, dropping temperatures to 0° F and inflicting Id6 points of damage per hour to those unsheltered. Overland movement is impossible. The storm lasts Id6+12 hours and snows remain Id3 days (summer), 2d6 days (spring/fall), or 2d20 days (winter).";
                break;
            case 4:
                result = "Ravage the area of effect with call lightning for 72 hours (432 bolts), randomly striking any targets";
                break;
            case 5:
                result = "Create a cloudkill spell upon the area of effect for Id6 hours";
                break;
            case 6:
                result = "Form a ring of creeping doom around the area of effect that constricts in a solid blanket inward, not diminishing until the center is reached (4 hours toreach center).";
                break;
            case 7:
                result = "Settle a death fog over the area of effect that remains in place for 2d20 rounds";
                break;
            case 8:
                result = "Strike the area of effect with a permanent drought. All water present or brought into the area of effect evaporates instantly";
                break;
            case 9:
                result = "Hit the area of effect with an earthquake spell.";
                break;
            case 10:
                result = "Rain afire storm down upon the area of effect for 2d6 rounds";
                break;
            case 11:
                result = "Flood the entire area of effect, destroying buildings and fields. All living creatures unable to fly risk drowning in the rushing waters. The waters recede to safe levels in Id6 hours but remain for 2d20 days.";
                break;
            case 12:
                result = "Sweep an incendiary cloud through the entire area of effect";
                break;
            case 13:
                result = "Settle an insect plague upon the area of effect for Id6 hours that, besides other spell effects, destroys all plants.";
                break;
            case 14:
                result = "Instantly create a permanent magic-dead area of effect. Nonartifact magical items do not function in the zone, spellcasting is impossible, and all existing spells are negated, including permanent enchantments on creatures. Summoned beings are driven back to their own plane.";
                break;
            case 15:
                result = "Create a meteor swarm to rain down upon the area of effect for Idl2 hours (8 spheres/round, or 480/hour), randomly striking targets within the area of effect";
                break;
            case 16:
                result = "Create a permanent spiral of degeneration that settles upon the area of effect. Only artifacts remain unaffected.";
                break;
            case 17:
                result = "Create a permanent wildzone in the area of effect";
                break;
            case 18:
                result = "Transfer the whole area of effect to a randomly chosen lower plane. The artifact is not transported.";
                break;
            case 19:
                result = "Strike the entire area of effect with a storm of vengeance";
                break;
            case 20:
                result = "Create permanent wolf spirits to guard the area of effect; they are hostile to all nonanimal life forms.";
                break;
        }
        return result;
    }

    public static String combat() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cause paralyzation by touch (3/day";
                break;
            case 2:
                result = "Provide initiative each combat round";
                break;
            case 3:
                result = "Have blur constantly in effect while the artifact is in hand";
                break;
            case 4:
                result = "Cast choose future (1/day";
                break;
            case 5:
                result = "Provide double attacks per round";
                break;
            case 6:
                result = "Cast energy drain by touch (1 /week)";
                break;
            case 7:
                result = "Cast fire shield (1/day";
                break;
            case 8:
                result = "Cause an opponent to Jumble (7/day";
                break;
            case 9:
                result = "Cause an opponent to suffer greater mal ison (7/day";
                break;
            case 10:
                result = "Imbue the user with the skills to use the weapon, despite class";
                break;
            case 11:
                result = "Cast harm upon an opponent struck by the weapon (1/week)";
                break;
            case 12:
                result = "Cast improved invisibility (1 /da";
                break;
            case 13:
                result = "Cast mirror image (7/day)";
                break;
            case 14:
                result = "Imbue the user with the combat skills to use two weapons at no penalty";
                break;
            case 15:
                result = "Weapon is aware of its surroundings. The user is never struck from behind and never suffers penalties for blind fighting.";
                break;
            case 16:
                result = "Cast slay living upon an opponent struck by the weapon (1/week)";
                break;
            case 17:
                result = "Imbue the user with all benefits of weapon specialization";
                break;
            case 18:
                result = "Cast Tenser's transformation upon the user (1/day)";
                break;
            case 19:
                result = "Function as a vampiric regeneration ri";
                break;
            case 20:
                result = "Cast warband quest (1 /month";
                break;
        }
        return result;
    }

    public static String conjuration() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast aerial servant (1/week)";
                break;
            case 2:
                result = "Cast animal horde (1/month)";
                break;
            case 3:
                result = "Cast animal summoning I-I1I—the user chooses the creature summoned (1/day)";
                break;
            case 4:
                result = "Cast animate object (1 /day";
                break;
            case 5:
                result = "Cast call lightning (1 /week";
                break;
            case 6:
                result = "Cast a conjure elemental spell of the user's choice (1/week)";
                break;
            case 7:
                result = "Cast Leomund's secure shelter (1/day)";
                break;
            case 8:
                result = "Cast fabricate (1/day)";
                break;
            case 9:
                result = "Call upon Leomund's secret chest at any time, using the chest to store the artifact when not needed";
                break;
            case 10:
                result = "Cast maze (1/week)";
                break;
            case 11:
                result = "Cast monster summoning I-VII with user choosing the monster summoned (1/week)";
                break;
            case 12:
                result = "Cast prismatic sphere (1 /week";
                break;
            case 13:
                result = "Summon Id4 berserkers as a horn of Valhalla (1/week)";
                break;
            case 14:
                result = "Summon a genie (1 /week)";
                break;
            case 15:
                result = "Summon an invisible stalker (1/week)";
                break;
            case 16:
                result = "Cast summon shadow (1 /week";
                break;
            case 17:
                result = "Inscribe a symbol of the user's choice (1/week)";
                break;
            case 18:
                result = "Cast trap the soul upon a creature by touch (1/month)";
                break;
            case 19:
                result = "Cast unseen servant to be constantly at hand to serve the user";
                break;
            case 20:
                result = "Cast weather summoning (1/week";
                break;
        }
        return result;
    }

    public static String cursed() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Instantly pollute all holy water within 30' of the user";
                break;
            case 2:
                result = "Reduce the user's Charisma by Id4 points";
                break;
            case 3:
                result = "Inflict a -1 penalty on the user's saving throws vs. magic";
                break;
            case 4:
                result = "Inflict a -2 penalty on the user's saving throws vs. poison";
                break;
            case 5:
                result = "Cause the user's touch to rot away wooden items the size of a bow or less in Id4 days";
                break;
            case 6:
                result = "Cause the user's touch to kill plants (inflicts Id6 points of damage to plantbased creatures)";
                break;
            case 7:
                result = "Cause NPC reactions to the user to be neutral or worse";
                break;
            case 8:
                result = "Inflict insatiable hunger upon the user, who must eat a full meal once every waking hour";
                break;
            case 9:
                result = "Instantly change the gender of anyone handling an artifact for the first time";
                break;
            case 10:
                result = "Inflict deafness upon the user, who then can only hear when people shout. Spellcasters must shout their spells to be successful.";
                break;
            case 11:
                result = "Inflict an incurable disease upon the user. At the beginning of each month a saving throw vs. death magic must be made to avoid losing 1 point of Constitution. When the user's Constitution reaches 0, death occurs.";
                break;
            case 12:
                result = "Cause the user's touch to have a 50% chance of draining the magic from any item not an artifact";
                break;
            case 13:
                result = "Inflict 5dl0 points of damage upon anyone handling the artifact for the first time";
                break;
            case 14:
                result = "Cause a 50% chance of the user being struck by a geas each time a power of the artifact is used. The geas must be completed before the artifact can be used again.";
                break;
            case 15:
                result = "Age the user ldlO years each time the artifact is used. Although the user suffers all the effects of aging, death by old age is not possible as long as the artifact remains in possession.";
                break;
            case 16:
                result = "Afflict the user with lycanthropy";
                break;
            case 17:
                result = "Cause the user's touch to be poisonous (saving throw vs. poison or 2dl2 points of damage are inflicted)";
                break;
            case 18:
                result = "Inflict photosensitivity upon the user, who suffers a -1 penalty to all die rolls while in daylight";
                break;
            case 19:
                result = "Cause the user's personal possessions to gradually disappear as if lost. Little things disappear first, then larger possessions, until the user is stripped of all worldly goods.";
                break;
            case 20:
                result = "Cause the user to become forgetful, starting with small details and progressing until full amnesia occurs";
                break;
        }
        return result;
    }

    public static String detection() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Provide a +1 bonus to the user's surprise rolls while the artifact is in hand";
                break;
            case 2:
                result = "Imbue the user with all benefits of the appraisal proficiency";
                break;
            case 3:
                result = "Have comprehend languages constantly in effect while the artifact is in hand";
                break;
            case 4:
                result = "Have detect charm continually in effect while the artifact is in hand";
                break;
            case 5:
                result = "Cast detect evil/detect good (3/day";
                break;
            case 6:
                result = "Detect illusions (3/day";
                break;
            case 7:
                result = "Cast detect invisibility (3/day";
                break;
            case 8:
                result = "Cast detect magic (3/day)";
                break;
            case 9:
                result = "Cast detect poison (3/day)";
                break;
            case 10:
                result = "Have detect snares & pits constantly in effect while the artifact is in hand";
                break;
            case 11:
                result = "Detect stonework traps";
                break;
            case 12:
                result = "Cast detect undead (3/day)";
                break;
            case 13:
                result = "Cast emotion read (3/day";
                break;
            case 14:
                result = "Cast extradimensional detection (3/day)";
                break;
            case 15:
                result = "Cast find traps (1/day)";
                break;
            case 16:
                result = "Have infravision continually in effect while the artifact is in hand";
                break;
            case 17:
                result = "Cast locate object (3/day)";
                break;
            case 18:
                result = "Cast true seeing (1 /day)";
                break;
            case 19:
                result = "Cast wizard eye (3/day";
                break;
            case 20:
                result = "Cast wizard sight (3/day)";
                break;
        }
        return result;
    }

    public static String divination() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast analyze balance by touch (7/day";
                break;
            case 2:
                result = "Cast augury (3/day";
                break;
            case 3:
                result = "The user communes with the deity affiliated with the artifact. Questions about the artifact are not answered (1/week).";
                break;
            case 4:
                result = "Cast consequence (1 /day)";
                break;
            case 5:
                result = "Permits the wielder to use contact other plane through the artifact, which selectively screens out all information relating to itself or its powers (1/week)";
                break;
            case 6:
                result = "Cast detect lie upon any creature within 10'(3/day)";
                break;
            case 7:
                result = "Cast detect scrying (1/day)";
                break;
            case 8:
                result = "Cast divination (1/day)";
                break;
            case 9:
                result = "Cast divine inspiration (1 /day)";
                break;
            case 10:
                result = "Cast ESP by touch (3/day)";
                break;
            case 11:
                result = "Cast find the path (1/day)";
                break;
            case 12:
                result = "Cast foresight (1/week)";
                break;
            case 13:
                result = "Cast identify by touch (1/day).";
                break;
            case 14:
                result = "Cast know alignment by touch (3/day)";
                break;
            case 15:
                result = "Cast moment reading (3/day)";
                break;
            case 16:
                result = "Cast past life (3/day)";
                break;
            case 17:
                result = "Cast patternweave by touch (1/day)";
                break;
            case 18:
                result = "Cast personal reading upon a creature by touch (3/day)";
                break;
            case 19:
                result = "Cast read magic by touching the artifact to written material (3/day)";
                break;
            case 20:
                result = "Cast stone tell by touch (3/day)";
                break;
        }
        return result;
    }

    public static String elementalAir() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast aerial servant (1/week)";
                break;
            case 2:
                result = "Cast cloud of purification (2/day)";
                break;
            case 3:
                result = "Cast cloudkill (1/day)";
                break;
            case 4:
                result = "Cast conjure air elemental (1/week)";
                break;
            case 5:
                result = "Cast control winds (3/day)";
                break;
            case 6:
                result = "Create a windstorm equal to a djinni's whirlwind. The storm lasts for 1 full turn (1/day)";
                break;
            case 7:
                result = "Have feather fall constantly in effect while the artifact is in hand";
                break;
            case 8:
                result = "Cast fly (3/day)";
                break;
            case 9:
                result = "Change the user (and all possessions carried) into a gaseous form, vulnerable only to area-effect spells. The user can remain gaseous for 2d6 rounds and can move at full normal movement rate (1/day)";
                break;
            case 10:
                result = "Cast gust of wind (5/day)";
                break;
            case 11:
                result = "Cast solid fog (1/day)";
                break;
            case 12:
                result = "Cast stinking cloud (3/day)";
                break;
            case 13:
                result = "Cast wall of fog (3/day)";
                break;
            case 14:
                result = "Cast weather summoning (1/day)";
                break;
            case 15:
                result = "Cast wind walk (1 /day)";
                break;
            case 16:
                result = "Cast wind wall (1/day)";
                break;
            case 17:
                result = "Have zone of sweet air (10' radius) continually surrounding the user while the artifact is in hand";
                break;
            case 18:
                result = "Open a portal to the Elemental Plane of Air. The passage can be traversed in both directions and the portal remains open for 1 hour. Any creature may use the portal.";
                break;
            case 19:
                result = "Imbue the user with immunity to the hostile environment found on the Elemental Plane of Air and the ability to fly through it normally while the artifact is in hand";
                break;
            case 20:
                result = "Send messages in a fashion similar to a whispering wind. The user need only know the name of the recipient before whispering a message to the sky. The user's voice reaches its target within 24 hours, if that person is on the same plane (at will).";
                break;
        }
        return result;
    }

    public static String elementalFire() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast chariot of Sustarre (1/week)";
                break;
            case 2:
                result = "Cast conjure fire elemental (1/week)";
                break;
            case 3:
                result = "Cast delayed blast fireball (1/day)";
                break;
            case 4:
                result = "Imbue the user with the ability to breathe a cone of fire 30' x 10', inflicting Id6 points of damage per level (1/day)";
                break;
            case 5:
                result = "Cast fire burst (3/day)";
                break;
            case 6:
                result = "Imbue the user with the ability to assume the form of a small fire elemental, changing body and possessions into flame. All within 5' suffer 2d6 points of damage each round (successful saving throw vs. spell reduces damage by one-half) and the user's physical blows inflict 2d8 points of damage per hit. The user is immune to all types of fire. The form lasts 2d6 rounds.";
                break;
            case 7:
                result = "Cast fire shield (1/day)";
                break;
            case 8:
                result = "Cast fireball (3/day)";
                break;
            case 9:
                result = "Cast fireflow (3/day)";
                break;
            case 10:
                result = "Cast flame strike (1/day)";
                break;
            case 11:
                result = "Cast flame walk (3/day)";
                break;
            case 12:
                result = "Cast Forest's fiery constrictor (1/day)";
                break;
            case 13:
                result = "Imbue the user with immunity to the hostile environment found on the Elemental Plane of Fire while the artifact is in hand";
                break;
            case 14:
                result = "Cast light (3/day)";
                break;
            case 15:
                result = "Cast Malec-Keth 's flame fist (3/day";
                break;
            case 16:
                result = "Have protection from fire constantly in effect while the artifact is in hand";
                break;
            case 17:
                result = "Imbue the user with the ability to sculpt normal fire by hand (no damage suffered). The fire can be fashioned into any shape the user is capable of making, but does not gain any special powers because of it. Sculpted fire holds its form for Id6 turns before returning to normal.";
                break;
            case 18:
                result = "Cast sunray (1/day)";
                break;
            case 19:
                result = "Cast wall of fire (1/day)";
                break;
            case 20:
                result = "Open a portal to the Elemental Plane of Fire. The passage can be traversed both ways and the portal remains open for 1 hour—any creature may use it.";
                break;
        }
        return result;
    }

    public static String elementalWater() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast airy water (3/day";
                break;
            case 2:
                result = "Cast cone of cold (1/day)";
                break;
            case 3:
                result = "Cast conjure water elemental (1/wee";
                break;
            case 4:
                result = "Transform small quantities of liquids into holy water (or unholy water, depending upon the item's nature) by touch. Up to 1 pint can be transformed (3/day).";
                break;
            case 5:
                result = "Cast create water (1 /day";
                break;
            case 6:
                result = "Cast ice storm (1/day";
                break;
            case 7:
                result = "Shoot a watery blue beam at a single target. If struck, the target must roll a successful saving throw vs. death magic. If the saving throw fails, the target is slain as the victim melts into a puddle of ooze. If the save is successful, the target still suffers 2d8 points of damage. This power is not effective on water-based creatures or those that lack solid structure (puddings, oozes, jellies.) (1/day).";
                break;
            case 8:
                result = "Empower any basin of water to function as a magic font spell by touch (1/day)";
                break;
            case 9:
                result = "Cast metamorphose liquids by touch (at will)";
                break;
            case 10:
                result = "Cast Otiluke's freezing sphere (1 /day)";
                break;
            case 11:
                result = "Cast part water (3/day)";
                break;
            case 12:
                result = "Imbue the user with immunity to the hostile environment found on the Elemental Plane of Water and with the ability to breathe normally there while the artifact is in hand";
                break;
            case 13:
                result = "Render any small body of water into a reflecting pool (1/day)";
                break;
            case 14:
                result = "Imbue the user with all sailing and navigation proficiencies for as long as the artifact is in the user's possession";
                break;
            case 15:
                result = "Transform any small body of water into a time pool (1/day)";
                break;
            case 16:
                result = "Cast wall of ice (1/day)";
                break;
            case 17:
                result = "Imbue the user with water breathing while the artifact is in hand";
                break;
            case 18:
                result = "Imbue the user with the abilities of water walk while the artifact is in hand";
                break;
            case 19:
                result = "Transform the user's body into liquid. The character can move through water at normal movement speeds and takes the form of a water weird. The user retains all normal abilities but cannot venture more than 30' away from a large body of water. The user is immune to waterbased attacks and suffers only half damage from electrical attacks. Fire-based attacks cause double damage, while cold-based spells cause no damage but force the user to revert to true form. The power lasts for Id6 hours or until canceled by the user (1/day).";
                break;
            case 20:
                result = "Open a portal to the Elemental Plane of Water. The passage can be traversed both ways and the portal remains open for 1 hour. Any creature may use the portal.";
                break;
        }
        return result;
    }

    public static String elementalEarth() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast animate rock by touch (1/day";
                break;
            case 2:
                result = "Imbue the user with the ability to appraise gems and jewelry as long as the artifact is in the user's possession";
                break;
            case 3:
                result = "Cast conjure earth elemental (1/wee";
                break;
            case 4:
                result = "Imbue the user with the ability to detect depth underground as a dwarf while the artifact is in hand";
                break;
            case 5:
                result = "Imbue the user with the ability to detect gems while the artifact is in hand";
                break;
            case 6:
                result = "Imbue the user with the ability to detect stonework traps as a dwarf while the artifact is in hand";
                break;
            case 7:
                result = "Cast earthquake (1/month";
                break;
            case 8:
                result = "Cast/Ztf of stone upon the user (3/day)";
                break;
            case 9:
                result = "Casi flesh to stone by touch (1/day)";
                break;
            case 10:
                result = "Imbue the user with the gem cutting proficiency";
                break;
            case 11:
                result = "Cast meld into stone (3/day)";
                break;
            case 12:
                result = "Cast move earth (1/week)";
                break;
            case 13:
                result = "Cast passwall (1/day)";
                break;
            case 14:
                result = "Cast sink (1/week)";
                break;
            case 15:
                result = "Cast stone shape (3/day)";
                break;
            case 16:
                result = "Cast stone tell (3/day)";
                break;
            case 17:
                result = "Cast stoneskin (1/day)";
                break;
            case 18:
                result = "Cast transmute rock to mud (1/day";
                break;
            case 19:
                result = "Cast wall of stone (1/day)";
                break;
            case 20:
                result = "Open a portal to the Elemental Plane of Earth. The passage can be traversed both ways and the portal remains open for 1 hour. Any creature may use the portal.";
                break;
        }
        return result;
    }

    public static String enchantmentCharm() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Increase the user's Charisma score by 3, but the enhancement only affects the opposite gender. The user need not present the artifact, but the power vanishes when the artifact is no longer in possession.";
                break;
            case 2:
                result = "Imbue the user with the effects of animal friendship while the artifact is in hand";
                break;
            case 3:
                result = "Cast charm monster (1 /day)";
                break;
            case 4:
                result = "Cast charm person (2/day)";
                break;
            case 5:
                result = "Cast charm plants (5/day)";
                break;
            case 6:
                result = "Cast cloak of bravery/cloak of fear (2/day)";
                break;
            case 7:
                result = "Cast command (7/day)";
                break;
            case 8:
                result = "Cast confusion (1 /day)";
                break;
            case 9:
                result = "Cast demand (1/week)";
                break;
            case 10:
                result = "Cast domination (1/week)";
                break;
            case 11:
                result = "Cast emotion (1/day)";
                break;
            case 12:
                result = "Imbue the user's gaze with the effects of cause fear while the device is in hand";
                break;
            case 13:
                result = "Cast feeblemind by touch (1/week)";
                break;
            case 14:
                result = "Cast forget by touch (3/day)";
                break;
            case 15:
                result = "Cast geas by touch. The mission must relate to the goals of the artifact, if any (1/month).";
                break;
            case 16:
                result = "Cast hold person (1/day)";
                break;
            case 17:
                result = "Cast hypnotism (1/day)";
                break;
            case 18:
                result = "Cast Otto's irresistible dance by touch (1/day)";
                break;
            case 19:
                result = "Cast quest by touch. The mission must relate to the goals of the artifact, if any (1/month)";
                break;
            case 20:
                result = "Cast suggestion (3/day";
                break;
        }
        return result;
    }

    public static String fateAndFortune() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Grant a +1 bonus to all saving throws";
                break;
            case 2:
                result = "Grant a +1 bonus to the user's THAC0";
                break;
            case 3:
                result = "Grant a +1 bonus (assuming a high roll is good) to all die rolls for the division of treasure, including magical items (but not other artifacts). This bonus is mandatory.";
                break;
            case 4:
                result = "Permanently imbue the user with all knowledge of the gambling proficiency. If the user is already proficient in gambling, add +1 to the ability score.";
                break;
            case 5:
                result = "Grant a +1 bonus to the user's encounter reaction rolls";
                break;
            case 6:
                result = "Imbue the user with natural luck in combat, granting a +1 bonus to all surprise rolls";
                break;
            case 7:
                result = "Grant a -1 bonus on all of the user's initiative rolls";
                break;
            case 8:
                result = "Grant the user a change of luck. Once per (game) day, the player can choose to have any die roll rerolled—an attack roll, damage roll, resurrection/survival roll, etc. The second roll is the actual result";
                break;
            case 9:
                result = "Grant the user incredible luck. Once per (game) week, the user's player can choose to alter any situation by declaring that an incredible event has occurred, (as long as it does not involve magical items or cause the death of a creature), and that incident follows. For example, evil wizards could be made to trip over their own robes in the middle of spellcasting, but could not be made to fall off a cliff.";
                break;
            case 10:
                result = "Grant the user's adventuring group automatic surprise (1/week)";
                break;
            case 11:
                result = "Allow the user to always find suitable work, despite status or skills";
                break;
            case 12:
                result = "Prevent the user from ever being completely destitute. Should all of the user's funds be consumed, some lucky chance happens to provide just enough to get by, such as a reward, coins found in the street or a kind stranger. The amount is never great, but it sees to basic needs.";
                break;
            case 13:
                result = "Always grant fair sailing winds to any ship or wind-powered vessel the user is aboard";
                break;
            case 14:
                result = "Prevent the user from ever being the target of pickpockets, thieves, house-breakers, or con artists—except for those who are specifically after the artifact. The power does not prevent general holdups by bandits and the like, only individual thefts.";
                break;
            case 15:
                result = "Prevents mercahants from overcharging the user, always offering the best deals";
                break;
            case 16:
                result = "Prevent the user from ever getting lost";
                break;
            case 17:
                result = "Allow the user to always sell goods at 50% greater than normal prices";
                break;
            case 18:
                result = "Prevent the user from ever going hungry. If the user is unable to buy or find food, some fortunate circumstance occurs to provide a meal. A deer may wander too close to camp, or an innkeeper may extend the hand of charity.";
                break;
            case 19:
                result = "Cause the user to always appear innocent of crimes. The user is never suspected or accused of a crime unless there is no other possibility. Even then, plausible explanations cause a reaction roll to see if the story is accepted";
                break;
            case 20:
                result = "Cause all spells cast by the user to operate at maximum effect";
                break;
        }
        return result;
    }

    public static String healing() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Constantly provide the user with the benefits of accelerated healing";
                break;
            case 2:
                result = "Cast aid/(5/day)";
                break;
            case 3:
                result = "Cast breath of life (1/week)";
                break;
            case 4:
                result = "Render one creature permanently immune to a specific disease or poison by touch (1/week)";
                break;
            case 5:
                result = "Cast cure blindness or deafness (3/day)";
                break;
            case 6:
                result = "Cast cure critical wounds (2/day";
                break;
            case 7:
                result = "Cast cure disease (3/day)";
                break;
            case 8:
                result = "Cure insanity or restore the mind of one affected by feeblemind or similar spells (1/week)";
                break;
            case 9:
                result = "Cast cure light wounds (7/day";
                break;
            case 10:
                result = "Cast cure serious wounds (3/day)";
                break;
            case 11:
                result = "Purge a body of the effects of any drug, including drunkenness, by touch (1/day)";
                break;
            case 12:
                result = "Cast heal (1/day)";
                break;
            case 13:
                result = "Grant the user the power to heal according to the paladin's ability to lay on hands";
                break;
            case 14:
                result = "Restore hit points to the user by draining Id6 points from every other creature within 10'. Drained points are added to the user's but cannot exceed the original hp total.";
                break;
            case 15:
                result = "Cast neutralize poison (3/day";
                break;
            case 16:
                result = "Cast raise dead (1/week)";
                break;
            case 17:
                result = "Cast regenerate (1 /week)";
                break;
            case 18:
                result = "Place a creature in stasis, halting all further decay and damage. The inert body is immune to gases, fire, cold, or lack of oxygen, but can still be harmed by physical attacks. Damage from these attacks is subtracted immediately, but death does not occur until the stasis is lifted. No further damage affects the body but all damage suffered and poisons still in the system continue their normal course when stasis ends. Only willing targets can be placed in stasis and the effects last 1 week or until the user of the artifact cancels it. Those in stasis are completely static, and not even mental and psionic powers can function (1/week).";
                break;
            case 19:
                result = "Cause all healing spells applied to the user to be doubly effective";
                break;
            case 20:
                result = "Erase scars and other disfigurements caused by battle (at will)";
                break;
        }
        return result;
    }

    public static String immunity() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Make the user immune to all normal diseases—colds, flu, black death, even food poisoning. This does not include diseases caused by spells or monsters (like mummy rot).";
                break;
            case 2:
                result = "Grant immunity to all magical diseases. While it offers no protection from things as mundane as the common cold or the flu, the immunity works against diseases like mummy rot and the results of cause disease spells.";
                break;
            case 3:
                result = "Imbue the user with immunity to all forms of disease, both normal and magical";
                break;
            case 4:
                result = "Create immunity to magically caused fear";
                break;
            case 5:
                result = "Make the user immune to all forms of gas. The user must still breathe, however, and could suffocate or drown.";
                break;
            case 6:
                result = "Confer immunity to charmand holdbased spells and spell-like effects— except those caused by artifacts";
                break;
            case 7:
                result = "Make the user immune to missiles from magic missile spells";
                break;
            case 8:
                result = "Imbue the user with immunity to all forms of psionics";
                break;
            case 9:
                result = "Provide immunity to all magical mental attacks. The character is still vulnerable, though, to psionic attacks.";
                break;
            case 10:
                result = "Grant immunity to all forms of paralysis, including all hold-based spells, and the results of web and entangle spells";
                break;
            case 11:
                result = "Create immunity to cold temperatures as low as -50°. Saving throws vs. magical cold gain a +2 bonus";
                break;
            case 12:
                result = "Bestows a 20% magic resistance or gives the user a 20% bonus to any existing magic resistance";
                break;
            case 13:
                result = "Impart immunity to all forms of poison";
                break;
            case 14:
                result = "Grant immunity to normal fire and provide a +2 bonus to saving throws vs. all forms of magical fire";
                break;
            case 15:
                result = "Make the user immune to all forms of electrical attack";
                break;
            case 16:
                result = "Make the user immune to energy drains";
                break;
            case 17:
                result = "mbue the user with complete immunity to illusions, always revealing these as shadowy forms. This power does not reveal anything where the physical form has actually been changed, such as polymorphed objects or creatures.";
                break;
            case 18:
                result = "Serves as a moral guide. Whenever the user intends something evil or unlawful, the artifact delivers a powerful, numbing shock. No damage is taken, but the user is paralyzed for Id6 rounds. The shocks end when the character gives up the intention or the temptation is gone. Note that this power is only suitable for lawful good artifacts.";
                break;
            case 19:
                result = "Confer immunity to polymorph and shapechanging spells and spell-like effects";
                break;
            case 20:
                result = "Make the user immune to petrification";
                break;
        }
        return result;
    }

    public static String majorPowers() {
        Random d100 = new Random();
        String result = "";
        int roll = d100.nextInt(100) + 1;

        switch (roll) {
            case 1:
            case 2:
            case 3:
                result = "Cast age object (1/day)";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                result = "Cast animate dead (1/day)";
                break;
            case 8:
            case 9:
            case 10:
                result = "Cast blade barrier (1 /day)";
                break;
            case 11:
            case 12:
            case 13:
                result = "Cast cause critical wounds (1/day)";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                result = "Cast cause serious wounds (3/day)";
                break;
            case 18:
            case 19:
            case 20:
                result = "Cast control undead (3/day)";
                break;
            case 21:
            case 22:
            case 23:
                result = "Cast control weather (1/day)";
                break;
            case 24:
            case 25:
            case 26:
                result = "Cast destruction (1/week)";
                break;
            case 27:
            case 28:
            case 29:
            case 30:
                result = "Cast forcecage (1/day)";
                break;
            case 31:
            case 32:
            case 33:
                result = "Cast globe of invulnerability (1/day)";
                break;
            case 34:
            case 35:
            case 36:
                result = "Cast harm (1/day)";
                break;
            case 37:
            case 38:
            case 39:
            case 40:
                result = "Cast hold monster (2/day)";
                break;
            case 41:
            case 42:
            case 43:
                result = "Cast liveoak (3/day)";
                break;
            case 44:
            case 45:
            case 46:
                result = "Cast magic jar (1/day)";
                break;
            case 47:
            case 48:
            case 49:
            case 50:
                result = "Cast mindshatter (1 /week)";
                break;
            case 51:
            case 52:
            case 53:
                result = "Cast Mordenkainen's disjunction (1/day)";
                break;
            case 54:
            case 55:
            case 56:
            case 57:
                result = "Cause ghoul-like paralysis by touch (3/day)";
                break;
            case 58:
            case 59:
            case 60:
                result = "Cast physical mirror (1/day)";
                break;
            case 61:
            case 62:
            case 63:
                result = "Cast prismatic spray (1/day)";
                break;
            case 64:
            case 65:
            case 66:
            case 67:
                result = "Cast resurrection (1/week)";
                break;
            case 68:
            case 69:
            case 70:
                result = "Cast reverse gravity (1/day)";
                break;
            case 71:
            case 72:
            case 73:
                result = "Cast shades (1/day)";
                break;
            case 74:
            case 75:
            case 76:
                result = "Cast spacewarp (1/day)";
                break;
            case 77:
            case 78:
            case 79:
            case 80:
                result = "Cast telekinesis (3/day)";
                break;
            case 81:
            case 82:
            case 83:
                result = "Cast time stop (1/week)";
                break;
            case 84:
            case 85:
            case 86:
                result = "Cast veil (1/day)";
                break;
            case 87:
            case 88:
            case 89:
            case 90:
                result = "Cast wall of force (1 /day)";
                break;
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
                result = "Cast wall of thorns (1/day)";
                break;
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                result = "Cast wither (1/week)";
                break;
        }
        return result;
    }

    public static String minorPowers() {
        Random d100 = new Random();
        String result = "";
        int roll = d100.nextInt(100) + 1;

        switch (roll) {
            case 1:
                result = "Cast accelerate healing (5/day)";
                break;
            case 2:
            case 3:
                result = "Cast audible glamer (7/day)";
                break;
            case 4:
            case 5:
                result = "Cast bless (7/day)";
                break;
            case 6:
            case 7:
                result = "Cast burning hands (5/day)";
                break;
            case 8:
                result = "Cast call upon faith (5/day)";
                break;
            case 9:
            case 10:
                result = "Cast call woodland beings (5/day)";
                break;
            case 11:
                result = "Cast calm chaos (5/day)";
                break;
            case 12:
            case 13:
                result = "Cast chill touch (5/day)";
                break;
            case 14:
            case 15:
                result = "Cast color spray (5/day)";
                break;
            case 16:
                result = "Cast contagion (3/day)";
                break;
            case 17:
            case 18:
                result = "Cast continual darkness (3/day)";
                break;
            case 19:
            case 20:
                result = "Cast continual light (3/day)";
                break;
            case 21:
            case 22:
                result = "Cast control temperature, 10' radius (5/day)";
                break;
            case 23:
            case 24:
                result = "Cast create food and water (5/day)";
                break;
            case 25:
            case 26:
                result = "Cast curse (5/day)";
                break;
            case 27:
            case 28:
                result = "Cast dancing lights (5/day)";
                break;
            case 29:
                result = "Cast darkness, 15' radius (3/day)";
                break;
            case 30:
                result = "Cast dispel magic (3/day)";
                break;
            case 31:
                result = "Cast dust devil (5/day)";
                break;
            case 32:
            case 33:
                result = "Cast enlarge (3/day)";
                break;
            case 34:
                result = "Cast enthrall (5/day)";
                break;
            case 35:
            case 36:
                result = "Cast Evard's black tentacles (3/day)";
                break;
            case 37:
            case 38:
            case 39:
                result = "Cast faerie fire (5/day)";
                break;
            case 40:
                result = "Cast fear (3/day)";
                break;
            case 41:
                result = "Cast fire purge (5/day)";
                break;
            case 42:
            case 43:
                result = "Cast flame arrow (5/day)";
                break;
            case 44:
            case 45:
                result = "Cast flaming sphere (5/day)";
                break;
            case 46:
                result = "Cast gaze reflection (3/day)";
                break;
            case 47:
            case 48:
                result = "Cast glyph of warding (3/day)";
                break;
            case 49:
            case 50:
                result = "Cast grease (7/day)";
                break;
            case 51:
            case 52:
                result = "Cast hold animal (5/day)";
                break;
            case 53:
            case 54:
                result = "Cast hold plant (5/day)";
                break;
            case 55:
                result = "Cast hypnotic pattern (3/day)";
                break;
            case 56:
            case 57:
                result = "Cast invisibility (3/day)";
                break;
            case 58:
                result = "Cast levitate (5/day)";
                break;
            case 59:
            case 60:
                result = "Cast magic missile (5/day)";
                break;
            case 61:
                result = "Cast music of the spheres (5/day)";
                break;
            case 62:
            case 63:
                result = "Cast phantasmal force (3/day)";
                break;
            case 64:
                result = "Cast phantasmal killer (3/day)";
                break;
            case 65:
            case 66:
                result = "Cast plant growth (5/day)";
                break;
            case 67:
            case 68:
                result = "Cast polymorph other (3/day)";
                break;
            case 69:
            case 70:
                result = "Cast protection from cantrips (7/day)";
                break;
            case 71:
            case 72:
                result = "Cast shadow monsters (3/day)";
                break;
            case 73:
            case 74:
                result = "Cast shocking grasp (5/day)";
                break;
            case 75:
                result = "Cast shout (3/day)";
                break;
            case 76:
            case 77:
                result = "Cast silence, 15' radius (3/day)";
                break;
            case 78:
            case 79:
                result = "Cast sleep (5/day)";
                break;
            case 80:
                result = "Cast slow (3/day)";
                break;
            case 81:
                result = "Cast slow poison (7/day)";
                break;
            case 82:
                result = "Cast spike growth (3/day)";
                break;
            case 83:
            case 84:
                result = "Cast stinking cloud (5/day)";
                break;
            case 85:
            case 86:
                result = "Cast stone shape (5/day)";
                break;
            case 87:
            case 88:
                result = "Cast summon lycanthrope (3/day)";
                break;
            case 89:
            case 90:
                result = "Cast tongues (5/day)";
                break;
            case 91:
            case 92:
                result = "Cast trip (5/day)";
                break;
            case 93:
            case 94:
            case 95:
                result = "Cast vampiric touch (3/day)";
                break;
            case 96:
            case 97:
            case 98:
                result = "Cast web (5/day)";
                break;
            case 99:
            case 100:
                result = "Cast wizard lock (5/day)";
                break;
        }
        return result;
    }

    public static String movement() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast air walk (2/day";
                break;
            case 2:
                result = "Cast blink (3/day)";
                break;
            case 3:
                result = "Cast dimensional folding (1/da";
                break;
            case 4:
                result = "Imbue the user with double the normal overland movement rate as long as the artifact is in hand";
                break;
            case 5:
                result = "Cast flame walk (3/day)";
                break;
            case 6:
                result = "Cast fly (2/day)";
                break;
            case 7:
                result = "Cast free action (1/day)";
                break;
            case 8:
                result = "Cast haste (1/day)";
                break;
            case 9:
                result = "Cast jump (5/day)";
                break;
            case 10:
                result = "Cast pass without truce (3/day)";
                break;
            case 11:
                result = "Cast passwall (1 /day)";
                break;
            case 12:
                result = "Cast rainbow bridge (1/day)";
                break;
            case 13:
                result = "Cast shadow walk (1/day";
                break;
            case 14:
                result = "Cast spider climb (3/day";
                break;
            case 15:
                result = "Cast teleport without error (1 /day)";
                break;
            case 16:
                result = "Cast transport via plants (3/day";
                break;
            case 17:
                result = "Cast water walk (5/day)";
                break;
            case 18:
                result = "Cast wind walk (1/day)";
                break;
            case 19:
                result = "Cast word of recall (1/day";
                break;
            case 20:
                result = "Cast wraithform (1/day)";
                break;
        }
        return result;
    }

    public static String offensivePowers() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast age creature (1/day";
                break;
            case 2:
                result = "Cast Bigby's crushing hand (1/day";
                break;
            case 3:
                result = "Fire a black beam of death that causes 2d8 points of damage to any creature successfully hit. The beam's range is 100 yards (5/day).";
                break;
            case 4:
                result = "Cast cause critical wounds (1/day)";
                break;
            case 5:
                result = "Cast chain lightning (1/day)";
                break;
            case 6:
                result = "Cast claws of the umber hulk (1 /day)";
                break;
            case 7:
                result = "Inflict an equal amount of damage upon any creature that inflicts nonspell damage upon the user";
                break;
            case 8:
                result = "Cast disintegrate (1/week)";
                break;
            case 9:
                result = "Cast finger of death (1/week)";
                break;
            case 10:
                result = "Cast fireball (1/day)";
                break;
            case 11:
                result = "Cast flame strike (1/day)";
                break;
            case 12:
                result = "Cast lightning bolt (1/day)";
                break;
            case 13:
                result = "Cast mindshatter (1/day)";
                break;
            case 14:
                result = "Cast power word, blind (1 /day)";
                break;
            case 15:
                result = "Cast power word, stun (1 /day)";
                break;
            case 16:
                result = "Cast power word, kill (1 /week)";
                break;
            case 17:
                result = "Cast shape change (1 /week";
                break;
            case 18:
                result = "Cast suffocate (1/week)";
                break;
            case 19:
                result = "Cast vanish (1 /week)";
                break;
            case 20:
                result = "Cast weird (1/week)";
                break;
        }
        return result;
    }

    public static String nature() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Have animal friendship constantly in effect as long as the artifact is in hand";
                break;
            case 2:
                result = "Cast animal growth (3/day)";
                break;
            case 3:
                result = "Transfer one of a creature's powers to the user by touch. This can include AC, movement, senses, or any noncombat special ability. The transfer lasts 1 hour and then fades (3/day).";
                break;
            case 4:
                result = "Imbue the user with the ability to see through the eyes of any normal animal. The creature must be within sight and within 60' of the artifact at the time of activation. The power lasts Id3 turns (3/day).";
                break;
            case 5:
                result = "Cast animal summoning III (2/day";
                break;
            case 6:
                result = "Cast call lightning (1 /day";
                break;
            case 7:
                result = "Protect the user as a cloak of elvenkind";
                break;
            case 8:
                result = "Cast charm plants (3/day)";
                break;
            case 9:
                result = "Cast entangle (3/day";
                break;
            case 10:
                result = "Heighten one of the user's senses—keen hearing, infravision, superior smell, and the like, granting a +1 bonus to all surprise rolls";
                break;
            case 11:
                result = "Cast hold animal (3/'day)";
                break;
            case 12:
                result = "Have pass without trace continually in effect as long as the artifact is in hand";
                break;
            case 13:
                result = "Cast plant growth (3/day)";
                break;
            case 14:
                result = "Empower the user with the ability to speak with plants at will";
                break;
            case 15:
                result = "Grant the user the ability to speak with animals at will";
                break;
            case 16:
                result = "Cast transport via plants (1 /day)";
                break;
            case 17:
                result = "Cast wall of thorns (1/day)";
                break;
            case 18:
                result = "Cast warp wood (3/day";
                break;
            case 19:
                result = "Cast weather summoning (1/day";
                break;
            case 20:
                result = "Cast anti-plant shell (1 /day";
                break;
        }
        return result;
    }

    public static String necromantic() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast Abi-Dalzim 's horrid wilting (1 /day)";
                break;
            case 2:
                result = "Cast animate dead (3/day)";
                break;
            case 3:
                result = "Cast Bloodstone's frightful joining (2/day)";
                break;
            case 4:
                result = "Cast Bloodstone's spectral steed (1/day)";
                break;
            case 5:
                result = "Cast breath of death (1/day)";
                break;
            case 6:
                result = "Cast cause blindness (1/day)";
                break;
            case 7:
                result = "Cast chill touch (3/day)";
                break;
            case 8:
                result = "Cast contagion (2/day)";
                break;
            case 9:
                result = "Cast control undead (2/day";
                break;
            case 10:
                result = "Cast death spell (1/week)";
                break;
            case 11:
                result = "Cast energy drain (1 /week";
                break;
            case 12:
                result = "Cast feign death (3/day)";
                break;
            case 13:
                result = "Create a window to the border of the Negative Material Plane that remains open for 1 hour. Creatures can pass through freely from both sides.";
                break;
            case 14:
                result = "Cast slay living (1/week)";
                break;
            case 15:
                result = "Imbue the user with the ability to use speak with dead at will, as long as the artifact is in hand";
                break;
            case 16:
                result = "Cast summon shadow (1 /week)";
                break;
            case 17:
                result = "Transform the user into an undead creature. The user retains all original hit points and abilities and gains the immunities of an undead creature. In addition, the user is not affected by gasses or poisons that would harm a living being. The condition lasts Id6 turns (1/day).";
                break;
            case 18:
                result = "Cast vampiric touch (3/day";
                break;
            case 19:
                result = "Cast wail of the banshee (1 /week)";
                break;
            case 20:
                result = "Cast wither (1/week)";
                break;
        }
        return result;
    }

    public static String personalEnhancements() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast alter self at will for as long as the artifact is owned";
                break;
            case 2:
                result = "Cast clairaudience at will for as long as the artifact is owned";
                break;
            case 3:
                result = "Cast clairvoyance at will for as long as the artifact is owned";
                break;
            case 4:
                result = "Have animal friendship constantly in effect for as long as the artifact is owned";
                break;
            case 5:
                result = "Provide the user with the effects of deeppockets, regardless of what is worn for as long as the artifact is owned";
                break;
            case 6:
                result = "Imbue the user with invisibility to undead for as long as the artifact is owned";
                break;
            case 7:
                result = "Shield the user continually 'with protection from evil/protection from good (as appropriate to the artifact) for as long as the artifact is owned";
                break;
            case 8:
                result = "Regenerate two of the user's hit points per turn for as long as the artifact is owned";
                break;
            case 9:
                result = "Cast feign death at will for as long as the artifact is owned";
                break;
            case 10:
                result = "Cast friends at will for as long as the artifact is owned";
                break;
            case 11:
                result = "Cast lasting breath at will for as long as the artifact is owned";
                break;
            case 12:
                result = "Provide the user with a permanent +1 bonus to saving throws";
                break;
            case 13:
                result = "Permanently increase the user's prime requisite score (or scores) by 1";
                break;
            case 14:
                result = "Give the user the permanent ability to use comprehend languages at wil";
                break;
            case 15:
                result = "Endow the user with the permanent ability to use negative plane protection at will";
                break;
            case 16:
                result = "Grant the user the permanent ability to speak with monsters at will";
                break;
            case 17:
                result = "Impart permanent ability to speak with animals at will";
                break;
            case 18:
                result = "Provide the user with the permanent ability to speak with plants at will";
                break;
            case 19:
                result = "Furnish the permanent ability of water breathing at will";
                break;
            case 20:
                result = "Bestow upon the user the ability to use ventriloquism at will permanently";
                break;
        }
        return result;
    }

    public static String planar() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Cast astral spell (1 /week";
                break;
            case 2:
                result = "Cast astral window (1/week";
                break;
            case 3:
                result = "Cast binding (1/week";
                break;
            case 4:
                result = "Cast contact higher plane about any topic other than the artifact or its powers (1/week)";
                break;
            case 5:
                result = "Cast dimension door (1/day";
                break;
            case 6:
                result = "Energy drain one level/Hit Die from an opponent on a successful touch (1/day)";
                break;
            case 7:
                result = "Cast estate transference (1 /month";
                break;
            case 8:
                result = "Open a gate to a particular island of protomatter in the Ethereal Plane 100' x 100' across. This can be used by the character as a residence, storage place, or even prison (2/day).";
                break;
            case 9:
                result = "Create a 10' x 10' ethereal window, allowing viewing of whatever lies beyond. The window is one-way, so those viewed do not know it is there. Stepping through the window strands the person in the Ethereal Plane (1/day).";
                break;
            case 10:
                result = "Cast exaction (1/week)";
                break;
            case 11:
                result = "Cast extradimensional manipulation (1/week)";
                break;
            case 12:
                result = "Cast gate (1/week)";
                break;
            case 13:
                result = "Cast Mordenkainen's magnificent mansion (2/week)";
                break;
            case 14:
                result = "Imbue the user with the ability to phase like a phase spider (2/day)";
                break;
            case 15:
                result = "Grant the user immunity to the hostile environment of one plane, DM's choice. This lasts as long as the user owns the artifact.";
                break;
            case 16:
                result = "Open a window to any outer plane. Nothing can pass through the window, but events can be seen and heard in both directions (1/week).";
                break;
            case 17:
                result = "Cast plane shift (1/week";
                break;
            case 18:
                result = "Cast speak with astral traveler (1 /da";
                break;
            case 19:
                result = "Summon one nondeity from the outer planes. The name or type of creature must be known. Obedience is not guaranteed (1/month).";
                break;
            case 20:
                result = "Cast wish (1 /month)";
                break;
        }
        return result;
    }

    public static String protection() {
        Random d20 = new Random();
        String result = "";
        int roll = d20.nextInt(20) + 1;

        switch (roll) {
            case 1:
                result = "Grant an Armor Class bonus of+2 to the user when held";
                break;
            case 2:
                result = "Function as a ring of protection +2 when held";
                break;
            case 3:
                result = "Cast anti-magic shell (1 /day)";
                break;
            case 4:
                result = "Cast anti-plant shell (2/day)";
                break;
            case 5:
                result = "Cast armor upon any creature the artifact touches (5/day)";
                break;
            case 6:
                result = "Protect the user constantly with the effects ofa featherfall spell";
                break;
            case 7:
                result = "Cast fire shield (1/day)";
                break;
            case 8:
                result = "Generate a sphere offorbiddance, 15'in radius, centered on the artifact. The forbiddance is not permanent (as is the spell), but has a duration of 2d6 hours. It can be password locked, however (1/week).";
                break;
            case 9:
                result = "Hold mind blank in effect as long as the artifact is in hand";
                break;
            case 10:
                result = "Keep Negative Plane Protection continually in effect as long as the artifact is in hand, with no saving throw necessary";
                break;
            case 11:
                result = "Maintain nondetection constant effect as long as the artifact is in hand";
                break;
            case 12:
                result = "Hold protection from normal missiles continual effect as long as the artifact is in hand";
                break;
            case 13:
                result = "Keep protection from lightning constantly in effect as long as the artifact is in hand";
                break;
            case 14:
                result = "Maintain protection from fire continually in effect as long as the artifact is in hand";
                break;
            case 15:
                result = "Hold protection from paralysis in constant effect as long as the artifact is in hand";
                break;
            case 16:
                result = "Keep shield in effect when the artifact is boldly presented (5/day)";
                break;
            case 17:
                result = "Cast thief's lament on any nonliving item of chest size or smaller by touch. The effect is permanent (1/week)";
                break;
            case 18:
                result = "Cast unceasing vigilance of the holy sentinel (1/week)";
                break;
            case 19:
                result = "Cast undead ward upon a 100' by 100' cube. The undead are turned as if by an 18th level priest (1/week)";
                break;
            case 20:
                result = "Cast zone of truth (1/week)";
                break;
        }
        return result;
    }

    public static String divinationResult() {
        Random d10 = new Random();
        String result = "";
        int roll = d10.nextInt(10) + 1;

        switch (roll) {
            case 1:
            case 2:
                result = "I11 omen. The characters should not undertake any task this day. If this advice is ignored, all characters suffer a -1 on attack rolls and saving throws for the rest of the day. Their chance for encounters are doubled and a -10% reaction modifier is applied to all encounters.";
                break;
            case 3:
            case 4:
                result = "Great danger exists. The chance for encounters doubles for the day and a -10 reaction modifier applies to all encounters. Adversaries have a +1 applied to their attack rolls for that day.";
                break;
            case 5:
            case 6:
            case 7:
                result = "Neutral omen, no special modifiers apply.";
                break;
            case 8:
            case 9:
                result = "Favorable omen. The characters will be able to travel half again their normal traveling rate that day. Opponents will have a -1 on their attack rolls for that day.";
                break;
            case 10:
                result = "Auspicious omen. All the effects of a favorable omen apply. In addition, the characters gain a +1 on all saving throws made that day.";
                break;
        }
        return result;
    }

    public static String powerGenerator(String type) {
        String result = "" ;
            switch (type) {
                case "Abjuration":
                    result = abjuration();
                    break;
                case "Cataclysm":
                    result = cataclysm();
                    break;
                case "Combat":
                    result = combat();
                    break;
                case "Conjuration":
                    result = conjuration();
                    break;
                case "Cursed":
                    result = cursed();
                    break;
                case "Detection":
                    result = detection();
                    break;
                case "Divination":
                    result = divination();
                    break;
                case "Elemental Air":
                    result = elementalAir();
                    break;
                case "Elemental Fire":
                    result = elementalFire();
                    break;
                case "Elemental Water":
                    result = elementalWater();
                    break;
                case "Elemental Earth":
                    result = elementalEarth();
                    break;
                case "Enchantment/Charm":
                    result = enchantmentCharm();
                    break;
                case "Fate and Fortune":
                    result = fateAndFortune();
                    break;
                case "Healing":
                    result = healing();
                    break;
                case "Immunity":
                    result = immunity();
                    break;
                case "Major Powers":
                    result = majorPowers();
                    break;
                case "Minor Powers":
                    result = minorPowers();
                    break;
                case "Movement":
                    result = movement();
                    break;
                case "Offensive Powers":
                    result = offensivePowers();
                    break;
                case "Nature":
                    result = nature();
                    break;
                case "Necromantic":
                    result = necromantic();
                    break;
                case "Personal Enhancements":
                    result = personalEnhancements();
                    break;
                case "Planar":
                    result = planar();
                    break;
                case "Protection":
                    result = protection();
                    break;
                case "Divination Results":
                    result = divinationResult();
                    break;
            }
        return result;
    }

    public static void main(String[] args) {

        new ArtifactPowerGenerator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, powerGenerator((String) powers.getSelectedItem()));

    }
}
