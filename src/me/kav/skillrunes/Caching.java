package me.kav.skillrunes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface Caching {
	List<String> nodmg = new ArrayList<String>();
    List<String> nodmg1 = new ArrayList<String>();
    List<String> explosions = new ArrayList<String>();
    List<String> vampire = new ArrayList<String>();
    public static HashMap<Player, Player> alreadyused = new HashMap<Player, Player>();
    List<String> barrage = new ArrayList<String>();
    List<String> explosivearrows = new ArrayList<String>();
    List<String> thorns = new ArrayList<String>();
    List<String> molotov = new ArrayList<String>();
    List<String> fireball = new ArrayList<String>();
    List<String> lightning = new ArrayList<String>();
    List<String> poison = new ArrayList<String>();
    List<String> crippling = new ArrayList<String>();
    List<String> arrows = new ArrayList<String>();
    List<String> waterwalking = new ArrayList<String>();
    public static HashMap<String, ItemStack> runes = new HashMap<String, ItemStack>();
    List<String> runelist = Arrays.asList("runeofspeed", "runeofbarraging", "runeoflightning", "runeofblinding", "runeofcrippling", "runeofdestruction", "runeofextremepower", "runeofflamingarrows","runeofflamethrowing", "runeofflying", "runeofhaste", "runeofhealing", "runeofincineration", "runeofinvisibility", "runeoflaunching", "runeofleaping", "runeoflightningarrows", "runeofminions", "runeofparalyzing", "runeofpoisonousarrows", "runeofregeneration", "runeofprotection", "runeofrepair", "runeofrepellant", "runeofsickening", "runeoflightning", "runeofthorns", "runeofvampirism", "runeofvolatilearrows", "runeofwither", "runeofarrowaffinity", "runeofwaterwalking", "runeofclarity", "runeofbreathing");
    
}