# Specify the minimum required CMake version
cmake_minimum_required(VERSION 3.27.4)

# Set the project name
project(GFG)

# Set the C++ standard
set(CMAKE_CXX_STANDARD 17)

# Set the output directory for executables
set(EXECUTABLE_OUTPUT_PATH "${CMAKE_BINARY_DIR}/Target")

# Specify the clang-format style
set(CLANG_FORMAT_STYLE "Microsoft")

# Add all .cpp files in the parent directory and its subdirectories to the project
file(GLOB_RECURSE SOURCES "*.cpp")

foreach(SOURCE_FILE ${SOURCES})
    # Get the filename (without extension) of the source file
    get_filename_component(EXECUTABLE_NAME ${SOURCE_FILE} NAME_WE)
    
    # Add an executable target for this source file
    add_executable(${EXECUTABLE_NAME} ${SOURCE_FILE})

    # Set the output directory for executables
    set_target_properties(${EXECUTABLE_NAME} PROPERTIES
        RUNTIME_OUTPUT_DIRECTORY "${EXECUTABLE_OUTPUT_PATH}"
    )

    # Format the source file using clang-format
    add_custom_command(
        TARGET ${EXECUTABLE_NAME}
        PRE_BUILD
        COMMAND clang-format -style=${CLANG_FORMAT_STYLE} -i ${SOURCE_FILE}
        COMMENT "Formatting ${SOURCE_FILE} file..."
    )
endforeach()