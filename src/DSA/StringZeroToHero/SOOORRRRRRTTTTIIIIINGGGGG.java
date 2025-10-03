package StringZeroToHero;

public class SOOORRRRRRTTTTIIIIINGGGGG {
    public static void main(String[] args) {
        System.out.println("1. Bubble Sort – Repeatedly swaps adjacent elements if they’re in the wrong order.\n" +
                "\n" +
                "Process:\n" +
                "\n" +
                "Compare 5 & 2 → swap → [2, 5, 4, 1, 3]\n" +
                "\n" +
                "Compare 5 & 4 → swap → [2, 4, 5, 1, 3]\n" +
                "\n" +
                "Compare 5 & 1 → swap → [2, 4, 1, 5, 3]\n" +
                "\n" +
                "Compare 5 & 3 → swap → [2, 4, 1, 3, 5]\n" +
                "\n" +
                "Repeat until sorted → [1, 2, 3, 4, 5]\n" +
                "\n" +
                "2. Selection Sort – Selects the smallest element and moves it to its correct position.\n" +
                "\n" +
                "Process:\n" +
                "\n" +
                "Find min in [5, 2, 4, 1, 3] → 1 → swap with first → [1, 2, 4, 5, 3]\n" +
                "\n" +
                "Find min in [2, 4, 5, 3] → 2 → already in place\n" +
                "\n" +
                "Find min in [4, 5, 3] → 3 → swap → [1, 2, 3, 5, 4]\n" +
                "\n" +
                "Find min in [5, 4] → 4 → swap → [1, 2, 3, 4, 5]\n" +
                "\n" +
                "3. Insertion Sort – Builds a sorted portion by inserting each element into its correct place.\n" +
                "\n" +
                "Process:\n" +
                "\n" +
                "Start with [5] (sorted)\n" +
                "\n" +
                "Insert 2 → [2, 5]\n" +
                "\n" +
                "Insert 4 → [2, 4, 5]\n" +
                "\n" +
                "Insert 1 → [1, 2, 4, 5]\n" +
                "\n" +
                "Insert 3 → [1, 2, 3, 4, 5]\n" +
                "\n" +
                "4. Merge Sort – Divides the array, recursively sorts subarrays, and merges them.\n" +
                "\n" +
                "Process:\n" +
                "\n" +
                "Divide [5, 2, 4, 1, 3] → [5, 2, 4] & [1, 3]\n" +
                "\n" +
                "Divide further: [5, 2, 4] → [5] & [2, 4]\n" +
                "\n" +
                "[2, 4] → [2] & [4], merge → [2, 4]\n" +
                "\n" +
                "Merge [5] & [2, 4] → [2, 4, 5]\n" +
                "\n" +
                "[1, 3] → [1] & [3], merge → [1, 3]\n" +
                "\n" +
                "Merge [2, 4, 5] & [1, 3] → [1, 2, 3, 4, 5]\n" +
                "\n" +
                "5. Quick Sort – Picks a pivot, partitions the array around it, recursively sorts partitions.\n" +
                "\n" +
                "Process:\n" +
                "\n" +
                "Pick pivot 3 → smaller [2,1], larger [5,4]\n" +
                "\n" +
                "Sort [2,1] → [1,2]; sort [5,4] → [4,5]\n" +
                "\n" +
                "Combine → [1,2,3,4,5]\n" +
                "\n" +
                "6. Heap Sort – Builds a heap and repeatedly extracts the max to sort.\n" +
                "\n" +
                "Process:\n" +
                "\n" +
                "Build max heap [5, 3, 4, 1, 2]\n" +
                "\n" +
                "Extract max 5 → swap with last → [2, 3, 4, 1, 5], heapify → [4, 3, 2, 1, 5]\n" +
                "\n" +
                "Extract max 4 → [1, 3, 2, 4, 5], heapify → [3, 1, 2, 4, 5]\n" +
                "\n" +
                "Extract max 3 → [2, 1, 3, 4, 5], heapify → [2, 1, 3, 4, 5]\n" +
                "\n" +
                "Extract max 2 → [1, 2, 3, 4, 5]");


        //
    }
}
