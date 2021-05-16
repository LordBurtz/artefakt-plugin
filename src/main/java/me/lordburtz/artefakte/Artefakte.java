package me.lordburtz.artefakte;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Artefakte extends JavaPlugin implements CommandExecutor {
    @Override
    public void onEnable() {
        getCommand("artefakt").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            ItemStack stack;
            if (args.length == 1) {
                if (args[0].equals("1")) {
                    if (!sender.getName().equals(getConfig().getString("artefakt1"))) return true;
                    stack = new ItemStack(Material.NETHERITE_SWORD);
                    ItemMeta meta = stack.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "menta gwanath");
                    List<String> lore = new ArrayList<>();
                    lore.add("Artefakt");
                    meta.setLore(lore);
                    stack.setItemMeta(meta);
                    stack.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
                    stack.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
                    stack.addUnsafeEnchantment(Enchantment.MENDING, 1);
                    stack.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
                    stack.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
                    ((Player) sender).getInventory().addItem(stack);
                }
                if (args[0].equals("2")) {
                    if (!sender.getName().equals(getConfig().getString("artefakt2"))) return true;
                    stack = new ItemStack(Material.NETHERITE_SWORD);
                    ItemMeta meta = stack.getItemMeta();
                    meta.setDisplayName(ChatColor.RED + "your mom");
                    List<String> lore = new ArrayList<>();
                    lore.add("Artefakt");
                    meta.setLore(lore);
                    stack.setItemMeta(meta);
                    stack.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
                    stack.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
                    stack.addUnsafeEnchantment(Enchantment.MENDING, 1);
                    stack.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
                    stack.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
                    ((Player) sender).getInventory().addItem(stack);
                }
            }
        }
        return true;
    }
}
