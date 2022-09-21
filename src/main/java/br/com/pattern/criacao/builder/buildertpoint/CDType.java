package br.com.pattern.criacao.builder.buildertpoint;

import java.util.ArrayList;
import java.util.List;

public class CDType {

	private List<IPacking> items = new ArrayList<>();

	public void addItem(IPacking packs) {
		items.add(packs);
	}

	public void getCost() {
		for (IPacking packs : items) {
			packs.price();
		}
	}

	public String showItems() {
		StringBuilder buffer = new StringBuilder();
		for (IPacking packing : items) {
			buffer.append("CD name : " + packing.pack());
			buffer.append(", Price : " + packing.price());
			buffer.append("\n");
		}
		return buffer.toString();
	}
}